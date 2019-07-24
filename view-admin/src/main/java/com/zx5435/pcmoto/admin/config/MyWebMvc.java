package com.zx5435.pcmoto.admin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
public class MyWebMvc implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration loginIt = registry.addInterceptor(new MyInterceptor());

        loginIt.addPathPatterns("/**");
        loginIt.excludePathPatterns(Arrays.asList(
                "/user/login",
                "/error/**",
                "/css/**",
                "/js/**",
                "/img/**",
                "/"
        ));
    }

}
