package com.zx5435;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserViewApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(UserViewApp.class)
                .run(args);
    }

}
