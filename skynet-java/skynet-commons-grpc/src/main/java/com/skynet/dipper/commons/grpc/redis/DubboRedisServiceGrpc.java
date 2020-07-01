
    package com.skynet.dipper.commons.grpc.redis;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.config.ReferenceConfigBase;

import java.util.concurrent.TimeUnit;

import static org.apache.dubbo.common.constants.CommonConstants.DEFAULT_TIMEOUT;
import static org.apache.dubbo.common.constants.CommonConstants.TIMEOUT_KEY;

import static com.skynet.dipper.commons.grpc.redis.RedisServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@javax.annotation.Generated(
value = "by DubboGrpc generator",
comments = "Source: RedisService.proto")
public final class DubboRedisServiceGrpc {
private DubboRedisServiceGrpc() {}

public static class DubboRedisServiceStub implements IRedisService {

protected URL url;
protected ReferenceConfigBase<?> referenceConfig;

protected RedisServiceGrpc.RedisServiceBlockingStub blockingStub;
protected RedisServiceGrpc.RedisServiceFutureStub futureStub;
protected RedisServiceGrpc.RedisServiceStub stub;

public DubboRedisServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
this.url = url;
this.referenceConfig = referenceConfig;

blockingStub = RedisServiceGrpc.newBlockingStub(channel).build(channel, callOptions);
futureStub = RedisServiceGrpc.newFutureStub(channel).build(channel, callOptions);
stub = RedisServiceGrpc.newStub(channel).build(channel, callOptions);
}

    public com.skynet.dipper.commons.grpc.redis.IsOK exist(com.skynet.dipper.commons.grpc.redis.RKey request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .exist(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.IsOK> existAsync(com.skynet.dipper.commons.grpc.redis.RKey request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .exist(request);
    }

    public void exist(com.skynet.dipper.commons.grpc.redis.RKey request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .exist(request, responseObserver);
    }

    public com.skynet.dipper.commons.grpc.redis.IsOK setIfAbsent(com.skynet.dipper.commons.grpc.redis.RPair request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .setIfAbsent(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.IsOK> setIfAbsentAsync(com.skynet.dipper.commons.grpc.redis.RPair request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .setIfAbsent(request);
    }

    public void setIfAbsent(com.skynet.dipper.commons.grpc.redis.RPair request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .setIfAbsent(request, responseObserver);
    }

    public com.skynet.dipper.commons.grpc.redis.Result get(com.skynet.dipper.commons.grpc.redis.RKey request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .get(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.Result> getAsync(com.skynet.dipper.commons.grpc.redis.RKey request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .get(request);
    }

    public void get(com.skynet.dipper.commons.grpc.redis.RKey request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.Result> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .get(request, responseObserver);
    }

    public com.skynet.dipper.commons.grpc.redis.Empty set(com.skynet.dipper.commons.grpc.redis.RPair request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .set(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.Empty> setAsync(com.skynet.dipper.commons.grpc.redis.RPair request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .set(request);
    }

    public void set(com.skynet.dipper.commons.grpc.redis.RPair request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.Empty> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .set(request, responseObserver);
    }

    public com.skynet.dipper.commons.grpc.redis.IsOK delete(com.skynet.dipper.commons.grpc.redis.RKey request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .delete(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.IsOK> deleteAsync(com.skynet.dipper.commons.grpc.redis.RKey request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .delete(request);
    }

    public void delete(com.skynet.dipper.commons.grpc.redis.RKey request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .delete(request, responseObserver);
    }

}

public static DubboRedisServiceStub getDubboStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
return new DubboRedisServiceStub(channel, callOptions, url, referenceConfig);
}

public interface IRedisService {
    default public com.skynet.dipper.commons.grpc.redis.IsOK exist(com.skynet.dipper.commons.grpc.redis.RKey request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.IsOK> existAsync(com.skynet.dipper.commons.grpc.redis.RKey request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void exist(com.skynet.dipper.commons.grpc.redis.RKey request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK> responseObserver);

    default public com.skynet.dipper.commons.grpc.redis.IsOK setIfAbsent(com.skynet.dipper.commons.grpc.redis.RPair request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.IsOK> setIfAbsentAsync(com.skynet.dipper.commons.grpc.redis.RPair request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void setIfAbsent(com.skynet.dipper.commons.grpc.redis.RPair request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK> responseObserver);

    default public com.skynet.dipper.commons.grpc.redis.Result get(com.skynet.dipper.commons.grpc.redis.RKey request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.Result> getAsync(com.skynet.dipper.commons.grpc.redis.RKey request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void get(com.skynet.dipper.commons.grpc.redis.RKey request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.Result> responseObserver);

    default public com.skynet.dipper.commons.grpc.redis.Empty set(com.skynet.dipper.commons.grpc.redis.RPair request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.Empty> setAsync(com.skynet.dipper.commons.grpc.redis.RPair request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void set(com.skynet.dipper.commons.grpc.redis.RPair request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.Empty> responseObserver);

    default public com.skynet.dipper.commons.grpc.redis.IsOK delete(com.skynet.dipper.commons.grpc.redis.RKey request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.IsOK> deleteAsync(com.skynet.dipper.commons.grpc.redis.RKey request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void delete(com.skynet.dipper.commons.grpc.redis.RKey request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK> responseObserver);

}

public static abstract class RedisServiceImplBase implements io.grpc.BindableService, IRedisService {

private IRedisService proxiedImpl;

public final void setProxiedImpl(IRedisService proxiedImpl) {
this.proxiedImpl = proxiedImpl;
}

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.redis.IsOK exist(com.skynet.dipper.commons.grpc.redis.RKey request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.IsOK> existAsync(com.skynet.dipper.commons.grpc.redis.RKey request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.redis.IsOK setIfAbsent(com.skynet.dipper.commons.grpc.redis.RPair request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.IsOK> setIfAbsentAsync(com.skynet.dipper.commons.grpc.redis.RPair request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.redis.Result get(com.skynet.dipper.commons.grpc.redis.RKey request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.Result> getAsync(com.skynet.dipper.commons.grpc.redis.RKey request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.redis.Empty set(com.skynet.dipper.commons.grpc.redis.RPair request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.Empty> setAsync(com.skynet.dipper.commons.grpc.redis.RPair request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.redis.IsOK delete(com.skynet.dipper.commons.grpc.redis.RKey request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.IsOK> deleteAsync(com.skynet.dipper.commons.grpc.redis.RKey request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

        public void exist(com.skynet.dipper.commons.grpc.redis.RKey request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.redis.RedisServiceGrpc.getExistMethod(), responseObserver);
        }
        public void setIfAbsent(com.skynet.dipper.commons.grpc.redis.RPair request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.redis.RedisServiceGrpc.getSetIfAbsentMethod(), responseObserver);
        }
        public void get(com.skynet.dipper.commons.grpc.redis.RKey request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.Result> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.redis.RedisServiceGrpc.getGetMethod(), responseObserver);
        }
        public void set(com.skynet.dipper.commons.grpc.redis.RPair request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.Empty> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.redis.RedisServiceGrpc.getSetMethod(), responseObserver);
        }
        public void delete(com.skynet.dipper.commons.grpc.redis.RKey request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.redis.RedisServiceGrpc.getDeleteMethod(), responseObserver);
        }

@java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
    .addMethod(
    com.skynet.dipper.commons.grpc.redis.RedisServiceGrpc.getExistMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.redis.RKey,
    com.skynet.dipper.commons.grpc.redis.IsOK>(
    proxiedImpl, METHODID_EXIST)))
    .addMethod(
    com.skynet.dipper.commons.grpc.redis.RedisServiceGrpc.getSetIfAbsentMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.redis.RPair,
    com.skynet.dipper.commons.grpc.redis.IsOK>(
    proxiedImpl, METHODID_SET_IF_ABSENT)))
    .addMethod(
    com.skynet.dipper.commons.grpc.redis.RedisServiceGrpc.getGetMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.redis.RKey,
    com.skynet.dipper.commons.grpc.redis.Result>(
    proxiedImpl, METHODID_GET)))
    .addMethod(
    com.skynet.dipper.commons.grpc.redis.RedisServiceGrpc.getSetMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.redis.RPair,
    com.skynet.dipper.commons.grpc.redis.Empty>(
    proxiedImpl, METHODID_SET)))
    .addMethod(
    com.skynet.dipper.commons.grpc.redis.RedisServiceGrpc.getDeleteMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.redis.RKey,
    com.skynet.dipper.commons.grpc.redis.IsOK>(
    proxiedImpl, METHODID_DELETE)))
.build();
}
}
    private static final int METHODID_EXIST = 0;
    private static final int METHODID_SET_IF_ABSENT = 1;
    private static final int METHODID_GET = 2;
    private static final int METHODID_SET = 3;
    private static final int METHODID_DELETE = 4;

private static final class MethodHandlers
<Req, Resp> implements
io.grpc.stub.ServerCalls.UnaryMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.ServerStreamingMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.ClientStreamingMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.BidiStreamingMethod
<Req, Resp> {
private final IRedisService serviceImpl;
private final int methodId;

MethodHandlers(IRedisService serviceImpl, int methodId) {
this.serviceImpl = serviceImpl;
this.methodId = methodId;
}

@java.lang.Override
@java.lang.SuppressWarnings("unchecked")
public void invoke(Req request, io.grpc.stub.StreamObserver
<Resp> responseObserver) {
    switch (methodId) {
            case METHODID_EXIST:
            serviceImpl.exist((com.skynet.dipper.commons.grpc.redis.RKey) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK>) responseObserver);
            break;
            case METHODID_SET_IF_ABSENT:
            serviceImpl.setIfAbsent((com.skynet.dipper.commons.grpc.redis.RPair) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK>) responseObserver);
            break;
            case METHODID_GET:
            serviceImpl.get((com.skynet.dipper.commons.grpc.redis.RKey) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.Result>) responseObserver);
            break;
            case METHODID_SET:
            serviceImpl.set((com.skynet.dipper.commons.grpc.redis.RPair) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.Empty>) responseObserver);
            break;
            case METHODID_DELETE:
            serviceImpl.delete((com.skynet.dipper.commons.grpc.redis.RKey) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK>) responseObserver);
            break;
    default:
    throw new java.lang.AssertionError();
    }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver
    <Req> invoke(io.grpc.stub.StreamObserver
        <Resp> responseObserver) {
            switch (methodId) {
            default:
            throw new java.lang.AssertionError();
            }
            }
            }

            }
