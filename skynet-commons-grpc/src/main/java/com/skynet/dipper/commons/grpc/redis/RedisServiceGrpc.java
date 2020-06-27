package com.skynet.dipper.commons.grpc.redis;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: RedisService.proto")
public final class RedisServiceGrpc {

  private RedisServiceGrpc() {}

  public static final String SERVICE_NAME = "com.skynet.dipper.commons.grpc.redis.RedisService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.skynet.dipper.commons.grpc.redis.RKey,
      com.skynet.dipper.commons.grpc.redis.IsOK> getExistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "exist",
      requestType = com.skynet.dipper.commons.grpc.redis.RKey.class,
      responseType = com.skynet.dipper.commons.grpc.redis.IsOK.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skynet.dipper.commons.grpc.redis.RKey,
      com.skynet.dipper.commons.grpc.redis.IsOK> getExistMethod() {
    io.grpc.MethodDescriptor<com.skynet.dipper.commons.grpc.redis.RKey, com.skynet.dipper.commons.grpc.redis.IsOK> getExistMethod;
    if ((getExistMethod = RedisServiceGrpc.getExistMethod) == null) {
      synchronized (RedisServiceGrpc.class) {
        if ((getExistMethod = RedisServiceGrpc.getExistMethod) == null) {
          RedisServiceGrpc.getExistMethod = getExistMethod =
              io.grpc.MethodDescriptor.<com.skynet.dipper.commons.grpc.redis.RKey, com.skynet.dipper.commons.grpc.redis.IsOK>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "exist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skynet.dipper.commons.grpc.redis.RKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skynet.dipper.commons.grpc.redis.IsOK.getDefaultInstance()))
              .setSchemaDescriptor(new RedisServiceMethodDescriptorSupplier("exist"))
              .build();
        }
      }
    }
    return getExistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skynet.dipper.commons.grpc.redis.RPair,
      com.skynet.dipper.commons.grpc.redis.IsOK> getSetIfAbsentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setIfAbsent",
      requestType = com.skynet.dipper.commons.grpc.redis.RPair.class,
      responseType = com.skynet.dipper.commons.grpc.redis.IsOK.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skynet.dipper.commons.grpc.redis.RPair,
      com.skynet.dipper.commons.grpc.redis.IsOK> getSetIfAbsentMethod() {
    io.grpc.MethodDescriptor<com.skynet.dipper.commons.grpc.redis.RPair, com.skynet.dipper.commons.grpc.redis.IsOK> getSetIfAbsentMethod;
    if ((getSetIfAbsentMethod = RedisServiceGrpc.getSetIfAbsentMethod) == null) {
      synchronized (RedisServiceGrpc.class) {
        if ((getSetIfAbsentMethod = RedisServiceGrpc.getSetIfAbsentMethod) == null) {
          RedisServiceGrpc.getSetIfAbsentMethod = getSetIfAbsentMethod =
              io.grpc.MethodDescriptor.<com.skynet.dipper.commons.grpc.redis.RPair, com.skynet.dipper.commons.grpc.redis.IsOK>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setIfAbsent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skynet.dipper.commons.grpc.redis.RPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skynet.dipper.commons.grpc.redis.IsOK.getDefaultInstance()))
              .setSchemaDescriptor(new RedisServiceMethodDescriptorSupplier("setIfAbsent"))
              .build();
        }
      }
    }
    return getSetIfAbsentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skynet.dipper.commons.grpc.redis.RKey,
      com.skynet.dipper.commons.grpc.redis.Result> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.skynet.dipper.commons.grpc.redis.RKey.class,
      responseType = com.skynet.dipper.commons.grpc.redis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skynet.dipper.commons.grpc.redis.RKey,
      com.skynet.dipper.commons.grpc.redis.Result> getGetMethod() {
    io.grpc.MethodDescriptor<com.skynet.dipper.commons.grpc.redis.RKey, com.skynet.dipper.commons.grpc.redis.Result> getGetMethod;
    if ((getGetMethod = RedisServiceGrpc.getGetMethod) == null) {
      synchronized (RedisServiceGrpc.class) {
        if ((getGetMethod = RedisServiceGrpc.getGetMethod) == null) {
          RedisServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.skynet.dipper.commons.grpc.redis.RKey, com.skynet.dipper.commons.grpc.redis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skynet.dipper.commons.grpc.redis.RKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skynet.dipper.commons.grpc.redis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new RedisServiceMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skynet.dipper.commons.grpc.redis.RPair,
      com.skynet.dipper.commons.grpc.redis.Empty> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "set",
      requestType = com.skynet.dipper.commons.grpc.redis.RPair.class,
      responseType = com.skynet.dipper.commons.grpc.redis.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skynet.dipper.commons.grpc.redis.RPair,
      com.skynet.dipper.commons.grpc.redis.Empty> getSetMethod() {
    io.grpc.MethodDescriptor<com.skynet.dipper.commons.grpc.redis.RPair, com.skynet.dipper.commons.grpc.redis.Empty> getSetMethod;
    if ((getSetMethod = RedisServiceGrpc.getSetMethod) == null) {
      synchronized (RedisServiceGrpc.class) {
        if ((getSetMethod = RedisServiceGrpc.getSetMethod) == null) {
          RedisServiceGrpc.getSetMethod = getSetMethod =
              io.grpc.MethodDescriptor.<com.skynet.dipper.commons.grpc.redis.RPair, com.skynet.dipper.commons.grpc.redis.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skynet.dipper.commons.grpc.redis.RPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skynet.dipper.commons.grpc.redis.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RedisServiceMethodDescriptorSupplier("set"))
              .build();
        }
      }
    }
    return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.skynet.dipper.commons.grpc.redis.RKey,
      com.skynet.dipper.commons.grpc.redis.IsOK> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = com.skynet.dipper.commons.grpc.redis.RKey.class,
      responseType = com.skynet.dipper.commons.grpc.redis.IsOK.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.skynet.dipper.commons.grpc.redis.RKey,
      com.skynet.dipper.commons.grpc.redis.IsOK> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.skynet.dipper.commons.grpc.redis.RKey, com.skynet.dipper.commons.grpc.redis.IsOK> getDeleteMethod;
    if ((getDeleteMethod = RedisServiceGrpc.getDeleteMethod) == null) {
      synchronized (RedisServiceGrpc.class) {
        if ((getDeleteMethod = RedisServiceGrpc.getDeleteMethod) == null) {
          RedisServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.skynet.dipper.commons.grpc.redis.RKey, com.skynet.dipper.commons.grpc.redis.IsOK>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skynet.dipper.commons.grpc.redis.RKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skynet.dipper.commons.grpc.redis.IsOK.getDefaultInstance()))
              .setSchemaDescriptor(new RedisServiceMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RedisServiceStub newStub(io.grpc.Channel channel) {
    return new RedisServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RedisServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RedisServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RedisServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RedisServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RedisServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void exist(com.skynet.dipper.commons.grpc.redis.RKey request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK> responseObserver) {
      asyncUnimplementedUnaryCall(getExistMethod(), responseObserver);
    }

    /**
     */
    public void setIfAbsent(com.skynet.dipper.commons.grpc.redis.RPair request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK> responseObserver) {
      asyncUnimplementedUnaryCall(getSetIfAbsentMethod(), responseObserver);
    }

    /**
     */
    public void get(com.skynet.dipper.commons.grpc.redis.RKey request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void set(com.skynet.dipper.commons.grpc.redis.RPair request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.skynet.dipper.commons.grpc.redis.RKey request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skynet.dipper.commons.grpc.redis.RKey,
                com.skynet.dipper.commons.grpc.redis.IsOK>(
                  this, METHODID_EXIST)))
          .addMethod(
            getSetIfAbsentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skynet.dipper.commons.grpc.redis.RPair,
                com.skynet.dipper.commons.grpc.redis.IsOK>(
                  this, METHODID_SET_IF_ABSENT)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skynet.dipper.commons.grpc.redis.RKey,
                com.skynet.dipper.commons.grpc.redis.Result>(
                  this, METHODID_GET)))
          .addMethod(
            getSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skynet.dipper.commons.grpc.redis.RPair,
                com.skynet.dipper.commons.grpc.redis.Empty>(
                  this, METHODID_SET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skynet.dipper.commons.grpc.redis.RKey,
                com.skynet.dipper.commons.grpc.redis.IsOK>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class RedisServiceStub extends io.grpc.stub.AbstractStub<RedisServiceStub> {
    private RedisServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RedisServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RedisServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RedisServiceStub(channel, callOptions);
    }

    /**
     */
    public void exist(com.skynet.dipper.commons.grpc.redis.RKey request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setIfAbsent(com.skynet.dipper.commons.grpc.redis.RPair request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetIfAbsentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(com.skynet.dipper.commons.grpc.redis.RKey request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void set(com.skynet.dipper.commons.grpc.redis.RPair request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.skynet.dipper.commons.grpc.redis.RKey request,
        io.grpc.stub.StreamObserver<com.skynet.dipper.commons.grpc.redis.IsOK> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RedisServiceBlockingStub extends io.grpc.stub.AbstractStub<RedisServiceBlockingStub> {
    private RedisServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RedisServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RedisServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RedisServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.skynet.dipper.commons.grpc.redis.IsOK exist(com.skynet.dipper.commons.grpc.redis.RKey request) {
      return blockingUnaryCall(
          getChannel(), getExistMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skynet.dipper.commons.grpc.redis.IsOK setIfAbsent(com.skynet.dipper.commons.grpc.redis.RPair request) {
      return blockingUnaryCall(
          getChannel(), getSetIfAbsentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skynet.dipper.commons.grpc.redis.Result get(com.skynet.dipper.commons.grpc.redis.RKey request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skynet.dipper.commons.grpc.redis.Empty set(com.skynet.dipper.commons.grpc.redis.RPair request) {
      return blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.skynet.dipper.commons.grpc.redis.IsOK delete(com.skynet.dipper.commons.grpc.redis.RKey request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RedisServiceFutureStub extends io.grpc.stub.AbstractStub<RedisServiceFutureStub> {
    private RedisServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RedisServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RedisServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RedisServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.IsOK> exist(
        com.skynet.dipper.commons.grpc.redis.RKey request) {
      return futureUnaryCall(
          getChannel().newCall(getExistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.IsOK> setIfAbsent(
        com.skynet.dipper.commons.grpc.redis.RPair request) {
      return futureUnaryCall(
          getChannel().newCall(getSetIfAbsentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.Result> get(
        com.skynet.dipper.commons.grpc.redis.RKey request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.Empty> set(
        com.skynet.dipper.commons.grpc.redis.RPair request) {
      return futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skynet.dipper.commons.grpc.redis.IsOK> delete(
        com.skynet.dipper.commons.grpc.redis.RKey request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXIST = 0;
  private static final int METHODID_SET_IF_ABSENT = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_SET = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RedisServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RedisServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
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
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RedisServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RedisServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skynet.dipper.commons.grpc.redis.RedisProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RedisService");
    }
  }

  private static final class RedisServiceFileDescriptorSupplier
      extends RedisServiceBaseDescriptorSupplier {
    RedisServiceFileDescriptorSupplier() {}
  }

  private static final class RedisServiceMethodDescriptorSupplier
      extends RedisServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RedisServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RedisServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RedisServiceFileDescriptorSupplier())
              .addMethod(getExistMethod())
              .addMethod(getSetIfAbsentMethod())
              .addMethod(getGetMethod())
              .addMethod(getSetMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
