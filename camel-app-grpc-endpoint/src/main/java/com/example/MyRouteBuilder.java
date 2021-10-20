package com.example;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        // Log requests
        from("grpc://127.0.0.1:5050/com.example.grpc.Api?method=helloRequest")
            .log("Response: ${body}");
    }

}
