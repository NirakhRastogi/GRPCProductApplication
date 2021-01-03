package com.product.grpc;

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
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: ProductService.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "com.product.grpc.ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.product.grpc.Products> getGetAllProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllProducts",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.product.grpc.Products.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.product.grpc.Products> getGetAllProductsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.product.grpc.Products> getGetAllProductsMethod;
    if ((getGetAllProductsMethod = ProductServiceGrpc.getGetAllProductsMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetAllProductsMethod = ProductServiceGrpc.getGetAllProductsMethod) == null) {
          ProductServiceGrpc.getGetAllProductsMethod = getGetAllProductsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.product.grpc.Products>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.product.grpc.Products.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("getAllProducts"))
              .build();
        }
      }
    }
    return getGetAllProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.product.grpc.Product,
      com.product.grpc.Products> getSaveProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveProduct",
      requestType = com.product.grpc.Product.class,
      responseType = com.product.grpc.Products.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.product.grpc.Product,
      com.product.grpc.Products> getSaveProductMethod() {
    io.grpc.MethodDescriptor<com.product.grpc.Product, com.product.grpc.Products> getSaveProductMethod;
    if ((getSaveProductMethod = ProductServiceGrpc.getSaveProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getSaveProductMethod = ProductServiceGrpc.getSaveProductMethod) == null) {
          ProductServiceGrpc.getSaveProductMethod = getSaveProductMethod =
              io.grpc.MethodDescriptor.<com.product.grpc.Product, com.product.grpc.Products>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.product.grpc.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.product.grpc.Products.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("saveProduct"))
              .build();
        }
      }
    }
    return getSaveProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.product.grpc.Product,
      com.product.grpc.Products> getRemoveProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeProduct",
      requestType = com.product.grpc.Product.class,
      responseType = com.product.grpc.Products.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.product.grpc.Product,
      com.product.grpc.Products> getRemoveProductMethod() {
    io.grpc.MethodDescriptor<com.product.grpc.Product, com.product.grpc.Products> getRemoveProductMethod;
    if ((getRemoveProductMethod = ProductServiceGrpc.getRemoveProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getRemoveProductMethod = ProductServiceGrpc.getRemoveProductMethod) == null) {
          ProductServiceGrpc.getRemoveProductMethod = getRemoveProductMethod =
              io.grpc.MethodDescriptor.<com.product.grpc.Product, com.product.grpc.Products>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removeProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.product.grpc.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.product.grpc.Products.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("removeProduct"))
              .build();
        }
      }
    }
    return getRemoveProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.product.grpc.ProductId,
      com.product.grpc.Product> getGetProductWithIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProductWithId",
      requestType = com.product.grpc.ProductId.class,
      responseType = com.product.grpc.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.product.grpc.ProductId,
      com.product.grpc.Product> getGetProductWithIdMethod() {
    io.grpc.MethodDescriptor<com.product.grpc.ProductId, com.product.grpc.Product> getGetProductWithIdMethod;
    if ((getGetProductWithIdMethod = ProductServiceGrpc.getGetProductWithIdMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductWithIdMethod = ProductServiceGrpc.getGetProductWithIdMethod) == null) {
          ProductServiceGrpc.getGetProductWithIdMethod = getGetProductWithIdMethod =
              io.grpc.MethodDescriptor.<com.product.grpc.ProductId, com.product.grpc.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProductWithId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.product.grpc.ProductId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.product.grpc.Product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("getProductWithId"))
              .build();
        }
      }
    }
    return getGetProductWithIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllProducts(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.product.grpc.Products> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllProductsMethod(), responseObserver);
    }

    /**
     */
    public void saveProduct(com.product.grpc.Product request,
        io.grpc.stub.StreamObserver<com.product.grpc.Products> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveProductMethod(), responseObserver);
    }

    /**
     */
    public void removeProduct(com.product.grpc.Product request,
        io.grpc.stub.StreamObserver<com.product.grpc.Products> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveProductMethod(), responseObserver);
    }

    /**
     */
    public void getProductWithId(com.product.grpc.ProductId request,
        io.grpc.stub.StreamObserver<com.product.grpc.Product> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductWithIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllProductsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.product.grpc.Products>(
                  this, METHODID_GET_ALL_PRODUCTS)))
          .addMethod(
            getSaveProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.product.grpc.Product,
                com.product.grpc.Products>(
                  this, METHODID_SAVE_PRODUCT)))
          .addMethod(
            getRemoveProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.product.grpc.Product,
                com.product.grpc.Products>(
                  this, METHODID_REMOVE_PRODUCT)))
          .addMethod(
            getGetProductWithIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.product.grpc.ProductId,
                com.product.grpc.Product>(
                  this, METHODID_GET_PRODUCT_WITH_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllProducts(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.product.grpc.Products> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveProduct(com.product.grpc.Product request,
        io.grpc.stub.StreamObserver<com.product.grpc.Products> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeProduct(com.product.grpc.Product request,
        io.grpc.stub.StreamObserver<com.product.grpc.Products> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductWithId(com.product.grpc.ProductId request,
        io.grpc.stub.StreamObserver<com.product.grpc.Product> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductWithIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.product.grpc.Products getAllProducts(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.product.grpc.Products saveProduct(com.product.grpc.Product request) {
      return blockingUnaryCall(
          getChannel(), getSaveProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.product.grpc.Products removeProduct(com.product.grpc.Product request) {
      return blockingUnaryCall(
          getChannel(), getRemoveProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.product.grpc.Product getProductWithId(com.product.grpc.ProductId request) {
      return blockingUnaryCall(
          getChannel(), getGetProductWithIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.product.grpc.Products> getAllProducts(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllProductsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.product.grpc.Products> saveProduct(
        com.product.grpc.Product request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.product.grpc.Products> removeProduct(
        com.product.grpc.Product request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.product.grpc.Product> getProductWithId(
        com.product.grpc.ProductId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductWithIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_PRODUCTS = 0;
  private static final int METHODID_SAVE_PRODUCT = 1;
  private static final int METHODID_REMOVE_PRODUCT = 2;
  private static final int METHODID_GET_PRODUCT_WITH_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_PRODUCTS:
          serviceImpl.getAllProducts((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.product.grpc.Products>) responseObserver);
          break;
        case METHODID_SAVE_PRODUCT:
          serviceImpl.saveProduct((com.product.grpc.Product) request,
              (io.grpc.stub.StreamObserver<com.product.grpc.Products>) responseObserver);
          break;
        case METHODID_REMOVE_PRODUCT:
          serviceImpl.removeProduct((com.product.grpc.Product) request,
              (io.grpc.stub.StreamObserver<com.product.grpc.Products>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_WITH_ID:
          serviceImpl.getProductWithId((com.product.grpc.ProductId) request,
              (io.grpc.stub.StreamObserver<com.product.grpc.Product>) responseObserver);
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

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.product.grpc.ProductServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getGetAllProductsMethod())
              .addMethod(getSaveProductMethod())
              .addMethod(getRemoveProductMethod())
              .addMethod(getGetProductWithIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
