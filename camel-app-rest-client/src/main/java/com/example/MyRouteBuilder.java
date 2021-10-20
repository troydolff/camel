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

        from("timer://foo?period=5000&repeatCount=3")
            .to("http://127.0.0.1:8080/api/hello-path/Mercury?httpMethod=GET")
            .log("Response (path): ${body}");
            
        from("timer://foo?period=5000&repeatCount=3")
            .process(exchange -> exchange.getIn()
                .setHeader("name", "Venus")
            )
            .to("http://127.0.0.1:8080/api/hello-header?httpMethod=GET")
            .log("Response (header): ${body}");
            
        from("timer://foo?period=5000&repeatCount=3")
            .setBody()
            .simple("Earth")
            .toD("http://127.0.0.1:8080/api/hello-body?httpMethod=POST")
            .log("Response (body): ${body}");
            
    }

}
