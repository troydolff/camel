package com.example.grpc;

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
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: src/main/resources/api.proto")
public final class ApiGrpc {

  private ApiGrpc() {}

  public static final String SERVICE_NAME = "Api";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.example.grpc.HelloRequest,
      com.example.grpc.HelloReply> METHOD_HELLO = getHelloMethod();

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.HelloRequest,
      com.example.grpc.HelloReply> getHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.example.grpc.HelloRequest,
      com.example.grpc.HelloReply> getHelloMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.HelloRequest, com.example.grpc.HelloReply> getHelloMethod;
    if ((getHelloMethod = ApiGrpc.getHelloMethod) == null) {
      synchronized (ApiGrpc.class) {
        if ((getHelloMethod = ApiGrpc.getHelloMethod) == null) {
          ApiGrpc.getHelloMethod = getHelloMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.HelloRequest, com.example.grpc.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Api", "Hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiMethodDescriptorSupplier("Hello"))
                  .build();
          }
        }
     }
     return getHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApiStub newStub(io.grpc.Channel channel) {
    return new ApiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ApiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ApiFutureStub(channel);
  }

  /**
   */
  public static abstract class ApiImplBase implements io.grpc.BindableService {

    /**
     */
    public void hello(com.example.grpc.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.HelloRequest,
                com.example.grpc.HelloReply>(
                  this, METHODID_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class ApiStub extends io.grpc.stub.AbstractStub<ApiStub> {
    private ApiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiStub(channel, callOptions);
    }

    /**
     */
    public void hello(com.example.grpc.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ApiBlockingStub extends io.grpc.stub.AbstractStub<ApiBlockingStub> {
    private ApiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.HelloReply hello(com.example.grpc.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ApiFutureStub extends io.grpc.stub.AbstractStub<ApiFutureStub> {
    private ApiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.HelloReply> hello(
        com.example.grpc.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((com.example.grpc.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.HelloReply>) responseObserver);
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

  private static abstract class ApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.ApiProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Api");
    }
  }

  private static final class ApiFileDescriptorSupplier
      extends ApiBaseDescriptorSupplier {
    ApiFileDescriptorSupplier() {}
  }

  private static final class ApiMethodDescriptorSupplier
      extends ApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApiMethodDescriptorSupplier(String methodName) {
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
      synchronized (ApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApiFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
