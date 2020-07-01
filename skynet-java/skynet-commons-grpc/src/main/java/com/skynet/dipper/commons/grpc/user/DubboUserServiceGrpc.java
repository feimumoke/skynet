
    package com.skynet.dipper.commons.grpc.user;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.config.ReferenceConfigBase;

import java.util.concurrent.TimeUnit;

import static org.apache.dubbo.common.constants.CommonConstants.DEFAULT_TIMEOUT;
import static org.apache.dubbo.common.constants.CommonConstants.TIMEOUT_KEY;

import static com.skynet.dipper.commons.grpc.user.UserServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@javax.annotation.Generated(
value = "by DubboGrpc generator",
comments = "Source: UserService.proto")
public final class DubboUserServiceGrpc {
private DubboUserServiceGrpc() {}

public static class DubboUserServiceStub implements IUserService {

protected URL url;
protected ReferenceConfigBase<?> referenceConfig;

protected UserServiceGrpc.UserServiceBlockingStub blockingStub;
protected UserServiceGrpc.UserServiceFutureStub futureStub;
protected UserServiceGrpc.UserServiceStub stub;

public DubboUserServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
this.url = url;
this.referenceConfig = referenceConfig;

blockingStub = UserServiceGrpc.newBlockingStub(channel).build(channel, callOptions);
futureStub = UserServiceGrpc.newFutureStub(channel).build(channel, callOptions);
stub = UserServiceGrpc.newStub(channel).build(channel, callOptions);
}

    public com.skynet.dipper.commons.grpc.base.RpcResult login(com.skynet.dipper.commons.grpc.user.LoginInfo request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .login(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> loginAsync(com.skynet.dipper.commons.grpc.user.LoginInfo request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .login(request);
    }

    public void login(com.skynet.dipper.commons.grpc.user.LoginInfo request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .login(request, responseObserver);
    }

}

public static DubboUserServiceStub getDubboStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
return new DubboUserServiceStub(channel, callOptions, url, referenceConfig);
}

public interface IUserService {
    default public com.skynet.dipper.commons.grpc.base.RpcResult login(com.skynet.dipper.commons.grpc.user.LoginInfo request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> loginAsync(com.skynet.dipper.commons.grpc.user.LoginInfo request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void login(com.skynet.dipper.commons.grpc.user.LoginInfo request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver);

}

public static abstract class UserServiceImplBase implements io.grpc.BindableService, IUserService {

private IUserService proxiedImpl;

public final void setProxiedImpl(IUserService proxiedImpl) {
this.proxiedImpl = proxiedImpl;
}

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.base.RpcResult login(com.skynet.dipper.commons.grpc.user.LoginInfo request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> loginAsync(com.skynet.dipper.commons.grpc.user.LoginInfo request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

        public void login(com.skynet.dipper.commons.grpc.user.LoginInfo request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.user.UserServiceGrpc.getLoginMethod(), responseObserver);
        }

@java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
    .addMethod(
    com.skynet.dipper.commons.grpc.user.UserServiceGrpc.getLoginMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.user.LoginInfo,
    com.skynet.dipper.commons.grpc.base.RpcResult>(
    proxiedImpl, METHODID_LOGIN)))
.build();
}
}
    private static final int METHODID_LOGIN = 0;

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
private final IUserService serviceImpl;
private final int methodId;

MethodHandlers(IUserService serviceImpl, int methodId) {
this.serviceImpl = serviceImpl;
this.methodId = methodId;
}

@java.lang.Override
@java.lang.SuppressWarnings("unchecked")
public void invoke(Req request, io.grpc.stub.StreamObserver
<Resp> responseObserver) {
    switch (methodId) {
            case METHODID_LOGIN:
            serviceImpl.login((com.skynet.dipper.commons.grpc.user.LoginInfo) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult>) responseObserver);
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
