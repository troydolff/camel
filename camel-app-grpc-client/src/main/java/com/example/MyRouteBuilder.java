package com.example;

import org.apache.camel.builder.RouteBuilder;
import com.example.grpc.HelloRequest;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        // Log a message every 5 seconds, repeating 3 times
        from("timer://foo?period=5000&repeatCount=3")
            .process(exchange -> exchange.getIn()
                .setBody(HelloRequest.newBuilder().setName("world").build())
            )
            .to("grpc://127.0.0.1:5050/com.example.grpc.Api?method=hello&synchronous=true")
            .log("Response: ${body}");
    }

}
