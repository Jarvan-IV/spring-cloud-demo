package com.xp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayCloudApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("add_request_header_route", r -> r.path("/consumer/**")
                        .uri("http://jarvan-iv.github.io/2019/10/02/spring%20cloud%E6%9C%8D%E5%8A%A1%E9%97%B4%E8%B0%83%E7%94%A8/"))
                .build();
    }

}
