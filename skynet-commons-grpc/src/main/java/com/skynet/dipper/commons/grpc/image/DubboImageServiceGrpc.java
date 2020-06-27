
    package com.skynet.dipper.commons.grpc.image;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.config.ReferenceConfigBase;

import java.util.concurrent.TimeUnit;

import static org.apache.dubbo.common.constants.CommonConstants.DEFAULT_TIMEOUT;
import static org.apache.dubbo.common.constants.CommonConstants.TIMEOUT_KEY;

import static com.skynet.dipper.commons.grpc.image.ImageServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@javax.annotation.Generated(
value = "by DubboGrpc generator",
comments = "Source: ImageService.proto")
public final class DubboImageServiceGrpc {
private DubboImageServiceGrpc() {}

public static class DubboImageServiceStub implements IImageService {

protected URL url;
protected ReferenceConfigBase<?> referenceConfig;

protected ImageServiceGrpc.ImageServiceBlockingStub blockingStub;
protected ImageServiceGrpc.ImageServiceFutureStub futureStub;
protected ImageServiceGrpc.ImageServiceStub stub;

public DubboImageServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
this.url = url;
this.referenceConfig = referenceConfig;

blockingStub = ImageServiceGrpc.newBlockingStub(channel).build(channel, callOptions);
futureStub = ImageServiceGrpc.newFutureStub(channel).build(channel, callOptions);
stub = ImageServiceGrpc.newStub(channel).build(channel, callOptions);
}

    public com.skynet.dipper.commons.grpc.image.ImageSaveResult save(com.skynet.dipper.commons.grpc.image.ImageData request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .save(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.image.ImageSaveResult> saveAsync(com.skynet.dipper.commons.grpc.image.ImageData request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .save(request);
    }

    public void save(com.skynet.dipper.commons.grpc.image.ImageData request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.image.ImageSaveResult> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .save(request, responseObserver);
    }

    public com.skynet.dipper.commons.grpc.image.ImageLoadResult download(com.skynet.dipper.commons.grpc.image.ImagePath request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .download(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.image.ImageLoadResult> downloadAsync(com.skynet.dipper.commons.grpc.image.ImagePath request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .download(request);
    }

    public void download(com.skynet.dipper.commons.grpc.image.ImagePath request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.image.ImageLoadResult> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .download(request, responseObserver);
    }

}

public static DubboImageServiceStub getDubboStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
return new DubboImageServiceStub(channel, callOptions, url, referenceConfig);
}

public interface IImageService {
    default public com.skynet.dipper.commons.grpc.image.ImageSaveResult save(com.skynet.dipper.commons.grpc.image.ImageData request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.image.ImageSaveResult> saveAsync(com.skynet.dipper.commons.grpc.image.ImageData request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void save(com.skynet.dipper.commons.grpc.image.ImageData request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.image.ImageSaveResult> responseObserver);

    default public com.skynet.dipper.commons.grpc.image.ImageLoadResult download(com.skynet.dipper.commons.grpc.image.ImagePath request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.image.ImageLoadResult> downloadAsync(com.skynet.dipper.commons.grpc.image.ImagePath request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void download(com.skynet.dipper.commons.grpc.image.ImagePath request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.image.ImageLoadResult> responseObserver);

}

public static abstract class ImageServiceImplBase implements io.grpc.BindableService, IImageService {

private IImageService proxiedImpl;

public final void setProxiedImpl(IImageService proxiedImpl) {
this.proxiedImpl = proxiedImpl;
}

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.image.ImageSaveResult save(com.skynet.dipper.commons.grpc.image.ImageData request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.image.ImageSaveResult> saveAsync(com.skynet.dipper.commons.grpc.image.ImageData request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.image.ImageLoadResult download(com.skynet.dipper.commons.grpc.image.ImagePath request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.image.ImageLoadResult> downloadAsync(com.skynet.dipper.commons.grpc.image.ImagePath request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

        public void save(com.skynet.dipper.commons.grpc.image.ImageData request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.image.ImageSaveResult> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.image.ImageServiceGrpc.getSaveMethod(), responseObserver);
        }
        public void download(com.skynet.dipper.commons.grpc.image.ImagePath request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.image.ImageLoadResult> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.image.ImageServiceGrpc.getDownloadMethod(), responseObserver);
        }

@java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
    .addMethod(
    com.skynet.dipper.commons.grpc.image.ImageServiceGrpc.getSaveMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.image.ImageData,
    com.skynet.dipper.commons.grpc.image.ImageSaveResult>(
    proxiedImpl, METHODID_SAVE)))
    .addMethod(
    com.skynet.dipper.commons.grpc.image.ImageServiceGrpc.getDownloadMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.image.ImagePath,
    com.skynet.dipper.commons.grpc.image.ImageLoadResult>(
    proxiedImpl, METHODID_DOWNLOAD)))
.build();
}
}
    private static final int METHODID_SAVE = 0;
    private static final int METHODID_DOWNLOAD = 1;

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
private final IImageService serviceImpl;
private final int methodId;

MethodHandlers(IImageService serviceImpl, int methodId) {
this.serviceImpl = serviceImpl;
this.methodId = methodId;
}

@java.lang.Override
@java.lang.SuppressWarnings("unchecked")
public void invoke(Req request, io.grpc.stub.StreamObserver
<Resp> responseObserver) {
    switch (methodId) {
            case METHODID_SAVE:
            serviceImpl.save((com.skynet.dipper.commons.grpc.image.ImageData) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.image.ImageSaveResult>) responseObserver);
            break;
            case METHODID_DOWNLOAD:
            serviceImpl.download((com.skynet.dipper.commons.grpc.image.ImagePath) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.image.ImageLoadResult>) responseObserver);
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
