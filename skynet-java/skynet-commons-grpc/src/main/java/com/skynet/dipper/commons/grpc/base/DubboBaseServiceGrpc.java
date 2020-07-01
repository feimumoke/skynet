
    package com.skynet.dipper.commons.grpc.base;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.config.ReferenceConfigBase;

import java.util.concurrent.TimeUnit;

import static org.apache.dubbo.common.constants.CommonConstants.DEFAULT_TIMEOUT;
import static org.apache.dubbo.common.constants.CommonConstants.TIMEOUT_KEY;

import static com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@javax.annotation.Generated(
value = "by DubboGrpc generator",
comments = "Source: BaseService.proto")
public final class DubboBaseServiceGrpc {
private DubboBaseServiceGrpc() {}

public static class DubboBaseServiceStub implements IBaseService {

protected URL url;
protected ReferenceConfigBase<?> referenceConfig;

protected BaseServiceGrpc.BaseServiceBlockingStub blockingStub;
protected BaseServiceGrpc.BaseServiceFutureStub futureStub;
protected BaseServiceGrpc.BaseServiceStub stub;

public DubboBaseServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
this.url = url;
this.referenceConfig = referenceConfig;

blockingStub = BaseServiceGrpc.newBlockingStub(channel).build(channel, callOptions);
futureStub = BaseServiceGrpc.newFutureStub(channel).build(channel, callOptions);
stub = BaseServiceGrpc.newStub(channel).build(channel, callOptions);
}

    public com.skynet.dipper.commons.grpc.base.RpcResult save(com.skynet.dipper.commons.grpc.base.Entry request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .save(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> saveAsync(com.skynet.dipper.commons.grpc.base.Entry request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .save(request);
    }

    public void save(com.skynet.dipper.commons.grpc.base.Entry request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .save(request, responseObserver);
    }

    public com.skynet.dipper.commons.grpc.base.RpcResult deleteById(com.skynet.dipper.commons.grpc.base.KeyId request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .deleteById(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> deleteByIdAsync(com.skynet.dipper.commons.grpc.base.KeyId request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .deleteById(request);
    }

    public void deleteById(com.skynet.dipper.commons.grpc.base.KeyId request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .deleteById(request, responseObserver);
    }

    public com.skynet.dipper.commons.grpc.base.RpcResult deleteByPropertyList(com.skynet.dipper.commons.grpc.base.Entry request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .deleteByPropertyList(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> deleteByPropertyListAsync(com.skynet.dipper.commons.grpc.base.Entry request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .deleteByPropertyList(request);
    }

    public void deleteByPropertyList(com.skynet.dipper.commons.grpc.base.Entry request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .deleteByPropertyList(request, responseObserver);
    }

    public com.skynet.dipper.commons.grpc.base.RpcResult update(com.skynet.dipper.commons.grpc.base.Entry request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .update(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> updateAsync(com.skynet.dipper.commons.grpc.base.Entry request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .update(request);
    }

    public void update(com.skynet.dipper.commons.grpc.base.Entry request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .update(request, responseObserver);
    }

    public com.skynet.dipper.commons.grpc.base.RpcResult selectById(com.skynet.dipper.commons.grpc.base.KeyId request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .selectById(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> selectByIdAsync(com.skynet.dipper.commons.grpc.base.KeyId request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .selectById(request);
    }

    public void selectById(com.skynet.dipper.commons.grpc.base.KeyId request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .selectById(request, responseObserver);
    }

    public com.skynet.dipper.commons.grpc.base.RpcResult selectAll(com.skynet.dipper.commons.grpc.base.Empty request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .selectAll(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> selectAllAsync(com.skynet.dipper.commons.grpc.base.Empty request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .selectAll(request);
    }

    public void selectAll(com.skynet.dipper.commons.grpc.base.Empty request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .selectAll(request, responseObserver);
    }

    public com.skynet.dipper.commons.grpc.base.RpcResult selectByProperty(com.skynet.dipper.commons.grpc.base.Entry request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .selectByProperty(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> selectByPropertyAsync(com.skynet.dipper.commons.grpc.base.Entry request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .selectByProperty(request);
    }

    public void selectByProperty(com.skynet.dipper.commons.grpc.base.Entry request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .selectByProperty(request, responseObserver);
    }

    public com.skynet.dipper.commons.grpc.base.RpcResult selectListByProperty(com.skynet.dipper.commons.grpc.base.Entry request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .selectListByProperty(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> selectListByPropertyAsync(com.skynet.dipper.commons.grpc.base.Entry request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .selectListByProperty(request);
    }

    public void selectListByProperty(com.skynet.dipper.commons.grpc.base.Entry request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .selectListByProperty(request, responseObserver);
    }

    public com.skynet.dipper.commons.grpc.base.RpcResult selectPageList(com.skynet.dipper.commons.grpc.base.PageInfo request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .selectPageList(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> selectPageListAsync(com.skynet.dipper.commons.grpc.base.PageInfo request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .selectPageList(request);
    }

    public void selectPageList(com.skynet.dipper.commons.grpc.base.PageInfo request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .selectPageList(request, responseObserver);
    }

}

public static DubboBaseServiceStub getDubboStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
return new DubboBaseServiceStub(channel, callOptions, url, referenceConfig);
}

public interface IBaseService {
    default public com.skynet.dipper.commons.grpc.base.RpcResult save(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> saveAsync(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void save(com.skynet.dipper.commons.grpc.base.Entry request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver);

    default public com.skynet.dipper.commons.grpc.base.RpcResult deleteById(com.skynet.dipper.commons.grpc.base.KeyId request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> deleteByIdAsync(com.skynet.dipper.commons.grpc.base.KeyId request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void deleteById(com.skynet.dipper.commons.grpc.base.KeyId request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver);

    default public com.skynet.dipper.commons.grpc.base.RpcResult deleteByPropertyList(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> deleteByPropertyListAsync(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void deleteByPropertyList(com.skynet.dipper.commons.grpc.base.Entry request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver);

    default public com.skynet.dipper.commons.grpc.base.RpcResult update(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> updateAsync(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void update(com.skynet.dipper.commons.grpc.base.Entry request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver);

    default public com.skynet.dipper.commons.grpc.base.RpcResult selectById(com.skynet.dipper.commons.grpc.base.KeyId request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> selectByIdAsync(com.skynet.dipper.commons.grpc.base.KeyId request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void selectById(com.skynet.dipper.commons.grpc.base.KeyId request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver);

    default public com.skynet.dipper.commons.grpc.base.RpcResult selectAll(com.skynet.dipper.commons.grpc.base.Empty request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> selectAllAsync(com.skynet.dipper.commons.grpc.base.Empty request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void selectAll(com.skynet.dipper.commons.grpc.base.Empty request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver);

    default public com.skynet.dipper.commons.grpc.base.RpcResult selectByProperty(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> selectByPropertyAsync(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void selectByProperty(com.skynet.dipper.commons.grpc.base.Entry request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver);

    default public com.skynet.dipper.commons.grpc.base.RpcResult selectListByProperty(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> selectListByPropertyAsync(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void selectListByProperty(com.skynet.dipper.commons.grpc.base.Entry request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver);

    default public com.skynet.dipper.commons.grpc.base.RpcResult selectPageList(com.skynet.dipper.commons.grpc.base.PageInfo request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> selectPageListAsync(com.skynet.dipper.commons.grpc.base.PageInfo request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void selectPageList(com.skynet.dipper.commons.grpc.base.PageInfo request, io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver);

}

public static abstract class BaseServiceImplBase implements io.grpc.BindableService, IBaseService {

private IBaseService proxiedImpl;

public final void setProxiedImpl(IBaseService proxiedImpl) {
this.proxiedImpl = proxiedImpl;
}

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.base.RpcResult save(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> saveAsync(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.base.RpcResult deleteById(com.skynet.dipper.commons.grpc.base.KeyId request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> deleteByIdAsync(com.skynet.dipper.commons.grpc.base.KeyId request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.base.RpcResult deleteByPropertyList(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> deleteByPropertyListAsync(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.base.RpcResult update(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> updateAsync(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.base.RpcResult selectById(com.skynet.dipper.commons.grpc.base.KeyId request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> selectByIdAsync(com.skynet.dipper.commons.grpc.base.KeyId request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.base.RpcResult selectAll(com.skynet.dipper.commons.grpc.base.Empty request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> selectAllAsync(com.skynet.dipper.commons.grpc.base.Empty request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.base.RpcResult selectByProperty(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> selectByPropertyAsync(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.base.RpcResult selectListByProperty(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> selectListByPropertyAsync(com.skynet.dipper.commons.grpc.base.Entry request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.skynet.dipper.commons.grpc.base.RpcResult selectPageList(com.skynet.dipper.commons.grpc.base.PageInfo request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.base.RpcResult> selectPageListAsync(com.skynet.dipper.commons.grpc.base.PageInfo request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

        public void save(com.skynet.dipper.commons.grpc.base.Entry request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getSaveMethod(), responseObserver);
        }
        public void deleteById(com.skynet.dipper.commons.grpc.base.KeyId request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getDeleteByIdMethod(), responseObserver);
        }
        public void deleteByPropertyList(com.skynet.dipper.commons.grpc.base.Entry request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getDeleteByPropertyListMethod(), responseObserver);
        }
        public void update(com.skynet.dipper.commons.grpc.base.Entry request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getUpdateMethod(), responseObserver);
        }
        public void selectById(com.skynet.dipper.commons.grpc.base.KeyId request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getSelectByIdMethod(), responseObserver);
        }
        public void selectAll(com.skynet.dipper.commons.grpc.base.Empty request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getSelectAllMethod(), responseObserver);
        }
        public void selectByProperty(com.skynet.dipper.commons.grpc.base.Entry request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getSelectByPropertyMethod(), responseObserver);
        }
        public void selectListByProperty(com.skynet.dipper.commons.grpc.base.Entry request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getSelectListByPropertyMethod(), responseObserver);
        }
        public void selectPageList(com.skynet.dipper.commons.grpc.base.PageInfo request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult> responseObserver) {
        asyncUnimplementedUnaryCall(com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getSelectPageListMethod(), responseObserver);
        }

@java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
    .addMethod(
    com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getSaveMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.base.Entry,
    com.skynet.dipper.commons.grpc.base.RpcResult>(
    proxiedImpl, METHODID_SAVE)))
    .addMethod(
    com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getDeleteByIdMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.base.KeyId,
    com.skynet.dipper.commons.grpc.base.RpcResult>(
    proxiedImpl, METHODID_DELETE_BY_ID)))
    .addMethod(
    com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getDeleteByPropertyListMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.base.Entry,
    com.skynet.dipper.commons.grpc.base.RpcResult>(
    proxiedImpl, METHODID_DELETE_BY_PROPERTY_LIST)))
    .addMethod(
    com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getUpdateMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.base.Entry,
    com.skynet.dipper.commons.grpc.base.RpcResult>(
    proxiedImpl, METHODID_UPDATE)))
    .addMethod(
    com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getSelectByIdMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.base.KeyId,
    com.skynet.dipper.commons.grpc.base.RpcResult>(
    proxiedImpl, METHODID_SELECT_BY_ID)))
    .addMethod(
    com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getSelectAllMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.base.Empty,
    com.skynet.dipper.commons.grpc.base.RpcResult>(
    proxiedImpl, METHODID_SELECT_ALL)))
    .addMethod(
    com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getSelectByPropertyMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.base.Entry,
    com.skynet.dipper.commons.grpc.base.RpcResult>(
    proxiedImpl, METHODID_SELECT_BY_PROPERTY)))
    .addMethod(
    com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getSelectListByPropertyMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.base.Entry,
    com.skynet.dipper.commons.grpc.base.RpcResult>(
    proxiedImpl, METHODID_SELECT_LIST_BY_PROPERTY)))
    .addMethod(
    com.skynet.dipper.commons.grpc.base.BaseServiceGrpc.getSelectPageListMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.skynet.dipper.commons.grpc.base.PageInfo,
    com.skynet.dipper.commons.grpc.base.RpcResult>(
    proxiedImpl, METHODID_SELECT_PAGE_LIST)))
.build();
}
}
    private static final int METHODID_SAVE = 0;
    private static final int METHODID_DELETE_BY_ID = 1;
    private static final int METHODID_DELETE_BY_PROPERTY_LIST = 2;
    private static final int METHODID_UPDATE = 3;
    private static final int METHODID_SELECT_BY_ID = 4;
    private static final int METHODID_SELECT_ALL = 5;
    private static final int METHODID_SELECT_BY_PROPERTY = 6;
    private static final int METHODID_SELECT_LIST_BY_PROPERTY = 7;
    private static final int METHODID_SELECT_PAGE_LIST = 8;

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
private final IBaseService serviceImpl;
private final int methodId;

MethodHandlers(IBaseService serviceImpl, int methodId) {
this.serviceImpl = serviceImpl;
this.methodId = methodId;
}

@java.lang.Override
@java.lang.SuppressWarnings("unchecked")
public void invoke(Req request, io.grpc.stub.StreamObserver
<Resp> responseObserver) {
    switch (methodId) {
            case METHODID_SAVE:
            serviceImpl.save((com.skynet.dipper.commons.grpc.base.Entry) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult>) responseObserver);
            break;
            case METHODID_DELETE_BY_ID:
            serviceImpl.deleteById((com.skynet.dipper.commons.grpc.base.KeyId) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult>) responseObserver);
            break;
            case METHODID_DELETE_BY_PROPERTY_LIST:
            serviceImpl.deleteByPropertyList((com.skynet.dipper.commons.grpc.base.Entry) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult>) responseObserver);
            break;
            case METHODID_UPDATE:
            serviceImpl.update((com.skynet.dipper.commons.grpc.base.Entry) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult>) responseObserver);
            break;
            case METHODID_SELECT_BY_ID:
            serviceImpl.selectById((com.skynet.dipper.commons.grpc.base.KeyId) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult>) responseObserver);
            break;
            case METHODID_SELECT_ALL:
            serviceImpl.selectAll((com.skynet.dipper.commons.grpc.base.Empty) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult>) responseObserver);
            break;
            case METHODID_SELECT_BY_PROPERTY:
            serviceImpl.selectByProperty((com.skynet.dipper.commons.grpc.base.Entry) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult>) responseObserver);
            break;
            case METHODID_SELECT_LIST_BY_PROPERTY:
            serviceImpl.selectListByProperty((com.skynet.dipper.commons.grpc.base.Entry) request,
            (io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.base.RpcResult>) responseObserver);
            break;
            case METHODID_SELECT_PAGE_LIST:
            serviceImpl.selectPageList((com.skynet.dipper.commons.grpc.base.PageInfo) request,
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
