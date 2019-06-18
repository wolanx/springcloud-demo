package com.zx5435.pcmoto.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NewsServiceApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(NewsServiceApp.class)
                .run(args);
    }

}
