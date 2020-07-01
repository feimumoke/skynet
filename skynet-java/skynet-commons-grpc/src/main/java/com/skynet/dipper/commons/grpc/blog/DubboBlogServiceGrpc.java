
    package com.skynet.dipper.commons.grpc.blog;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.config.ReferenceConfigBase;

import java.util.concurrent.TimeUnit;

import static org.apache.dubbo.common.constants.CommonConstants.DEFAULT_TIMEOUT;
import static org.apache.dubbo.common.constants.CommonConstants.TIMEOUT_KEY;

import static com.skynet.dipper.commons.grpc.blog.BlogServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@javax.annotation.Generated(
value = "by DubboGrpc generator",
comments = "Source: BlogService.proto")
public final class DubboBlogServiceGrpc {
private DubboBlogServiceGrpc() {}

public static class DubboBlogServiceStub implements IBlogService {

protected URL url;
protected ReferenceConfigBase<?> referenceConfig;

protected BlogServiceGrpc.BlogServiceBlockingStub blockingStub;
protected BlogServiceGrpc.BlogServiceFutureStub futureStub;
protected BlogServiceGrpc.BlogServiceStub stub;

public DubboBlogServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
this.url = url;
this.referenceConfig = referenceConfig;

blockingStub = BlogServiceGrpc.newBlockingStub(channel).build(channel, callOptions);
futureStub = BlogServiceGrpc.newFutureStub(channel).build(channel, callOptions);
stub = BlogServiceGrpc.newStub(channel).build(channel, callOptions);
}

}

public static DubboBlogServiceStub getDubboStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
return new DubboBlogServiceStub(channel, callOptions, url, referenceConfig);
}

public interface IBlogService {
}

public static abstract class BlogServiceImplBase implements io.grpc.BindableService, IBlogService {

private IBlogService proxiedImpl;

public final void setProxiedImpl(IBlogService proxiedImpl) {
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
private final IBlogService serviceImpl;
private final int methodId;

MethodHandlers(IBlogService serviceImpl, int methodId) {
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
