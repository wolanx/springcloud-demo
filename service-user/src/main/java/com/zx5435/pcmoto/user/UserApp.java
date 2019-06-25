package com.zx5435.pcmoto.user;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class UserApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(UserApp.class)
                .run(args);
    }

}
