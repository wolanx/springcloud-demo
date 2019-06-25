package com.zx5435.pcmoto.admin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ViewAdminApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ViewAdminApp.class)
                .run(args);
    }

}
