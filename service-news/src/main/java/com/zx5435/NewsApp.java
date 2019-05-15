package com.zx5435;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class NewsApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(NewsApp.class)
                .run(args);
    }

}
