package com.zx5435.pcmoto.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
@MapperScan("com.zx5435.pcmoto.admin.model.plus")
public class ViewAdminApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ViewAdminApp.class)
                .run(args);
    }

}
