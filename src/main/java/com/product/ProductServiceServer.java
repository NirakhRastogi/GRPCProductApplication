package com.product;

import com.product.service.ProductServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ProductServiceServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new ProductServiceImpl())
                .build();

        server.start();
        server.awaitTermination();

    }

}
