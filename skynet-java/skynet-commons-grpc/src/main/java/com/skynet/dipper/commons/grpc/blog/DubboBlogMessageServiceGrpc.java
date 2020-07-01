
    package com.skynet.dipper.commons.grpc.blog;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.config.ReferenceConfigBase;

import java.util.concurrent.TimeUnit;

import static org.apache.dubbo.common.constants.CommonConstants.DEFAULT_TIMEOUT;
import static org.apache.dubbo.common.constants.CommonConstants.TIMEOUT_KEY;

import static com.skynet.dipper.commons.grpc.blog.BlogMessageServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@javax.annotation.Generated(
value = "by DubboGrpc generator",
comments = "Source: BlogMessageService.proto")
public final class DubboBlogMessageServiceGrpc {
private DubboBlogMessageServiceGrpc() {}

public static class DubboBlogMessageServiceStub implements IBlogMessageService {

protected URL url;
protected ReferenceConfigBase<?> referenceConfig;

protected BlogMessageServiceGrpc.BlogMessageServiceBlockingStub blockingStub;
protected BlogMessageServiceGrpc.BlogMessageServiceFutureStub futureStub;
protected BlogMessageServiceGrpc.BlogMessageServiceStub stub;

public DubboBlogMessageServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
this.url = url;
this.referenceConfig = referenceConfig;

blockingStub = BlogMessageServiceGrpc.newBlockingStub(channel).build(channel, callOptions);
futureStub = BlogMessageServiceGrpc.newFutureStub(channel).build(channel, callOptions);
stub = BlogMessageServiceGrpc.newStub(channel).build(channel, callOptions);
}

}

public static DubboBlogMessageServiceStub getDubboStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
return new DubboBlogMessageServiceStub(channel, callOptions, url, referenceConfig);
}

public interface IBlogMessageService {
}

public static abstract class BlogMessageServiceImplBase implements io.grpc.BindableService, IBlogMessageService {

private IBlogMessageService proxiedImpl;

public final void setProxiedImpl(IBlogMessageService proxiedImpl) {
this.proxiedImpl = proxiedImpl;
}


@java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
.build();
}
}

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
private final IBlogMessageService serviceImpl;
private final int methodId;

MethodHandlers(IBlogMessageService serviceImpl, int methodId) {
this.serviceImpl = serviceImpl;
this.methodId = methodId;
}

@java.lang.Override
@java.lang.SuppressWarnings("unchecked")
public void invoke(Req request, io.grpc.stub.StreamObserver
<Resp> responseObserver) {
    switch (methodId) {
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
