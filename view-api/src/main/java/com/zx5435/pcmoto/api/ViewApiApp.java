package com.zx5435.pcmoto.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ViewApiApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ViewApiApp.class)
                .run(args);
    }

}
