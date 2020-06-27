package com.skynet.dipper.service.redis.provider.api.impl;

import com.skynet.dipper.commons.grpc.redis.DubboRedisServiceGrpc;
import com.skynet.dipper.commons.grpc.redis.Empty;
import com.skynet.dipper.commons.grpc.redis.IsOK;
import com.skynet.dipper.commons.grpc.redis.RKey;
import com.skynet.dipper.commons.grpc.redis.RPair;
import com.skynet.dipper.commons.grpc.redis.Result;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import io.grpc.stub.StreamObserver;

@Service(version = "${services.versions.redis.v1}",interfaceClass = DubboRedisServiceGrpc.IRedisService.class)
public class RedisServiceImpl extends DubboRedisServiceGrpc.RedisServiceImplBase {

    private static RedisServiceImpl redisService;

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @PostConstruct
    public void init() {
        redisService = this;
        redisService.redisTemplate = this.redisTemplate;
    }


    @Override
    public void exist(RKey request, StreamObserver<IsOK> responseObserver) {
        Boolean hasKey = redisService.redisTemplate.hasKey(request.getKey());
        responseObserver.onNext(IsOK.newBuilder().setOk(hasKey).build());
        responseObserver.onCompleted();
    }

    @Override
    public void setIfAbsent(RPair request, StreamObserver<IsOK> responseObserver) {
        Boolean isOk = redisService.redisTemplate.opsForValue().setIfAbsent(request.getKey(), request.getValue());
        responseObserver.onNext(IsOK.newBuilder().setOk(isOk).build());
        responseObserver.onCompleted();
    }

    @Override
    public void get(RKey request, StreamObserver<Result> responseObserver) {
        Object o = redisService.redisTemplate.opsForValue().get(request.getKey());
        responseObserver.onNext(Result.newBuilder().setValue(o.toString()).build());
        responseObserver.onCompleted();
    }

    @Override
    public void set(RPair request, StreamObserver<Empty> responseObserver) {
        redisService.redisTemplate.opsForValue().set(request.getKey(),request.getValue());
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void delete(RKey request, StreamObserver<IsOK> responseObserver) {
        Boolean delete = redisService.redisTemplate.delete(request.getKey());
        responseObserver.onNext(IsOK.newBuilder().setOk(delete).build());
        responseObserver.onCompleted();
    }
}
