package com.zx5435.pcmoto.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaApp.class)
                .run(args);
    }

}
