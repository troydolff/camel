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

        restConfiguration()
            .component("undertow")
            .enableCORS(true)
            .dataFormatProperty("prettyPrint", "true")
            .apiContextPath("/api-doc")
            .apiProperty("api.title", "Camel API")
            .apiProperty("api.description", "An Example Camel API")
            .apiProperty("api.version", "1.0")
            .apiProperty("cors", "true")
            .contextPath("/api")
            .host("0.0.0.0")
            .port(8080);

        rest("/hello-path")
            .get("/{name}")
            .route()
            .transform()
            .simple("Hello, ${header.name}!");
            
        rest("/hello-header")
            .get("/")
            .route()
            .transform()
            .simple("Hello, $simple{header.name}!");
            
        rest("/hello-body")
            .post("/")
            .route()
            .transform()
            .simple("Hello, ${body}!");
    }

}
