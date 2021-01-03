package com.product.service;

import com.google.protobuf.Empty;
import com.product.grpc.Product;
import com.product.grpc.ProductId;
import com.product.grpc.ProductServiceGrpc;
import com.product.grpc.Products;
import io.grpc.stub.StreamObserver;

public class ProductServiceImpl extends ProductServiceGrpc.ProductServiceImplBase {

    Products.Builder products = Products.newBuilder();

    @Override
    public void getAllProducts(Empty request, StreamObserver<Products> responseObserver) {
        responseObserver.onNext(products.build());
        responseObserver.onCompleted();
    }

    @Override
    public void saveProduct(Product request, StreamObserver<Products> responseObserver) {
        products.addProduct(request);
        responseObserver.onNext(products.build());
        responseObserver.onCompleted();
    }

    @Override
    public void removeProduct(Product request, StreamObserver<Products> responseObserver) {
        int index = 0;
        for (Product product : products.getProductList()) {
            if (product.getItemid() == request.getItemid()) {
                break;
            }
            index++;
        }
        products.removeProduct(index);
        responseObserver.onNext(products.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getProductWithId(ProductId request, StreamObserver<Product> responseObserver) {
        Product toSend = null;
        for (Product product : products.getProductList()) {
            if (product.getItemid() == request.getItemid()) {
                toSend = product;
                break;
            }
        }
        responseObserver.onNext(toSend);
        responseObserver.onCompleted();
    }
}
