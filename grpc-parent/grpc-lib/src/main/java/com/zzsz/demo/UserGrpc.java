package com.zzsz.demo;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.15.0)",
    comments = "Source: com/zzsz/user.proto")
public class UserGrpc {

  private UserGrpc() {}

  public static final String SERVICE_NAME = "com.zzsz.User";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.zzsz.demo.UserRequest,
      com.zzsz.demo.UserResponse> METHOD_GET_USER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.zzsz.User", "getUser"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.zzsz.demo.UserRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.zzsz.demo.UserResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    return new UserStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserFutureStub(channel);
  }

  /**
   */
  @java.lang.Deprecated public static interface User {

    /**
     */
    public void getUser(com.zzsz.demo.UserRequest request,
        io.grpc.stub.StreamObserver<com.zzsz.demo.UserResponse> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class UserImplBase implements User, io.grpc.BindableService {

    @java.lang.Override
    public void getUser(com.zzsz.demo.UserRequest request,
        io.grpc.stub.StreamObserver<com.zzsz.demo.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return UserGrpc.bindService(this);
    }
  }

  /**
   */
  @java.lang.Deprecated public static interface UserBlockingClient {

    /**
     */
    public com.zzsz.demo.UserResponse getUser(com.zzsz.demo.UserRequest request);
  }

  /**
   */
  @java.lang.Deprecated public static interface UserFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zzsz.demo.UserResponse> getUser(
        com.zzsz.demo.UserRequest request);
  }

  public static class UserStub extends io.grpc.stub.AbstractStub<UserStub>
      implements User {
    private UserStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
    }

    @java.lang.Override
    public void getUser(com.zzsz.demo.UserRequest request,
        io.grpc.stub.StreamObserver<com.zzsz.demo.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER, getCallOptions()), request, responseObserver);
    }
  }

  public static class UserBlockingStub extends io.grpc.stub.AbstractStub<UserBlockingStub>
      implements UserBlockingClient {
    private UserBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.zzsz.demo.UserResponse getUser(com.zzsz.demo.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER, getCallOptions(), request);
    }
  }

  public static class UserFutureStub extends io.grpc.stub.AbstractStub<UserFutureStub>
      implements UserFutureClient {
    private UserFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.zzsz.demo.UserResponse> getUser(
        com.zzsz.demo.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractUser extends UserImplBase {}

  private static final int METHODID_GET_USER = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final User serviceImpl;
    private final int methodId;

    public MethodHandlers(User serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER:
          serviceImpl.getUser((com.zzsz.demo.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.zzsz.demo.UserResponse>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GET_USER);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final User serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_GET_USER,
          asyncUnaryCall(
            new MethodHandlers<
              com.zzsz.demo.UserRequest,
              com.zzsz.demo.UserResponse>(
                serviceImpl, METHODID_GET_USER)))
        .build();
  }
}
