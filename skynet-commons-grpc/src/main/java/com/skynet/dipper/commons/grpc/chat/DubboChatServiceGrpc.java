
    package com.skynet.dipper.commons.grpc.chat;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.config.ReferenceConfigBase;

import java.util.concurrent.TimeUnit;

import static org.apache.dubbo.common.constants.CommonConstants.DEFAULT_TIMEOUT;
import static org.apache.dubbo.common.constants.CommonConstants.TIMEOUT_KEY;

import static com.skynet.dipper.commons.grpc.chat.ChatServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@javax.annotation.Generated(
value = "by DubboGrpc generator",
comments = "Source: ChatService.proto")
public final class DubboChatServiceGrpc {
private DubboChatServiceGrpc() {}

public static class DubboChatServiceStub implements IChatService {

protected URL url;
protected ReferenceConfigBase<?> referenceConfig;

protected ChatServiceGrpc.ChatServiceBlockingStub blockingStub;
protected ChatServiceGrpc.ChatServiceFutureStub futureStub;
protected ChatServiceGrpc.ChatServiceStub stub;

public DubboChatServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
this.url = url;
this.referenceConfig = referenceConfig;

blockingStub = ChatServiceGrpc.newBlockingStub(channel).build(channel, callOptions);
futureStub = ChatServiceGrpc.newFutureStub(channel).build(channel, callOptions);
stub = ChatServiceGrpc.newStub(channel).build(channel, callOptions);
}

    public com.skynet.dipper.commons.grpc.chat.MVInit init(com.skynet.dipper.commons.grpc.chat.UserId request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .init(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.chat.MVInit> initAsync(com.skynet.dipper.commons.grpc.chat.UserId request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .init(request);
    }

    public void init(com.skynet.dipper.commons.grpc.chat.UserId request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.chat.MVInit> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .init(request, responseObserver);
    }

}

public static DubboChatServiceStub getDubboStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
return new DubboChatServiceStub(channel, callOptions, url, referenceConfig);
}

public interface IChatService {
    default public com.skynet.dipper.commons.grpc.chat.MVInit init(com.skynet.dipper.commons.grpc.chat.UserId request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.chat.MVInit> initAsync(com.skynet.dipper.commons.grpc.chat.UserId request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void init(com.skynet.dipper.commons.grpc.chat.UserId request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.chat.MVInit> responseObserver);

}

public static abstract class ChatServiceImplBase implements io.grpc.BindableService, IChatService {

private IChatService proxiedImpl;

public final void setProxiedImpl(IChatService proxiedImpl) {
this.proxiedImpl = proxiedImpl;
}

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.chat.MVInit init(com.skynet.dipper.commons.grpc.chat.UserId request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.chat.MVInit> initAsync(com.skynet.dipper.commons.grpc.chat.UserId request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

        public void init(com.skynet.dipper.commons.grpc.chat.UserId request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.chat.MVInit> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.chat.ChatServiceGrpc.getInitMethod(), responseObserver);
        }

@java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
    .addMethod(
    com.skynet.dipper.commons.grpc.chat.ChatServiceGrpc.getInitMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.chat.UserId,
    com.skynet.dipper.commons.grpc.chat.MVInit>(
    proxiedImpl, METHODID_INIT)))
.build();
}
}
    private static final int METHODID_INIT = 0;

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
private final IChatService serviceImpl;
private final int methodId;

MethodHandlers(IChatService serviceImpl, int methodId) {
this.serviceImpl = serviceImpl;
this.methodId = methodId;
}

@java.lang.Override
@java.lang.SuppressWarnings("unchecked")
public void invoke(Req request, io.grpc.stub.StreamObserver
<Resp> responseObserver) {
    switch (methodId) {
            case METHODID_INIT:
            serviceImpl.init((com.skynet.dipper.commons.grpc.chat.UserId) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.chat.MVInit>) responseObserver);
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
