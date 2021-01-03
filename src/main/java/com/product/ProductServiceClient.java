package com.product;

import com.google.protobuf.Empty;
import com.product.grpc.Product;
import com.product.grpc.ProductId;
import com.product.grpc.ProductServiceGrpc;
import com.product.grpc.Products;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ProductServiceClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        ProductServiceGrpc.ProductServiceBlockingStub stub = ProductServiceGrpc.newBlockingStub(channel);

        Products products = stub.saveProduct(Product.newBuilder().setItemid(1).setPrice(20.5f).setCategory("Cat1").setName("ItemName1").build());
        System.out.println(products);

        products = stub.saveProduct(Product.newBuilder().setItemid(2).setPrice(20.7f).setCategory("Cat2").setName("ItemName2").build());
        System.out.println(products);

        products = stub.getAllProducts(Empty.newBuilder().build());
        System.out.println(products);

        products = stub.removeProduct(Product.newBuilder().setItemid(1).build());
        System.out.println(products);

        Product product = stub.getProductWithId(ProductId.newBuilder().setItemid(2).build());
        System.out.println(product);

    }
}
