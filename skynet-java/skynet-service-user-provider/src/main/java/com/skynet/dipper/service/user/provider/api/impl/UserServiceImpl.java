package com.skynet.dipper.service.user.provider.api.impl;


import com.google.protobuf.Any;
import com.skynet.dipper.commons.constant.RpcConstant;
import com.skynet.dipper.commons.domain.TUser;
import com.skynet.dipper.commons.grpc.base.RpcResult;
import com.skynet.dipper.commons.grpc.user.DubboUserServiceGrpc;
import com.skynet.dipper.commons.grpc.user.LoginInfo;

import com.skynet.dipper.commons.grpc.user.UserPro;
import com.skynet.dipper.commons.mapper.TUserMapper;
import com.skynet.dipper.commons.utils.ProtobufUtils;


import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

import io.grpc.stub.StreamObserver;

@Service(version = "${services.versions.user.v1}",interfaceClass = DubboUserServiceGrpc.IUserService.class)
@Transactional
public class UserServiceImpl extends DubboUserServiceGrpc.UserServiceImplBase {
    @Autowired
    protected TUserMapper userMapper;

    @Override
    public void login(LoginInfo request, StreamObserver<RpcResult> responseObserver) {
        String userName = request.getUserName();
        String password = request.getPassword();
        TUser tUser = new TUser();
        tUser.setUserName(userName);
        tUser.setPassword(password);
        TUser tUser1 = userMapper.selectOne(tUser);
        try {
            if(Objects.isNull(tUser1)){
                responseObserver.onNext(nullRpcResult().build());
            }else {
                RpcResult.Builder builder = okRpcResult();
                UserPro user = ProtobufUtils.objectToPf(tUser1, UserPro.newBuilder());
                builder.setData(Any.pack(user));
                responseObserver.onNext(builder.build());
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            responseObserver.onCompleted();
        }
    }

    protected RpcResult.Builder okRpcResult() {
        return RpcResult.newBuilder().setRpcCode(RpcConstant.RESULT_OK).setMessage(RpcConstant.RESULT_SUCCESS_STR);
    }


    protected RpcResult.Builder nullRpcResult() {
        return RpcResult.newBuilder().setRpcCode(RpcConstant.RESULT_NULL).setMessage(RpcConstant.RESULT_FAIL_NULL);
    }
}
