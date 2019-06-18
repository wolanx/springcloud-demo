package com.zx5435.pcmoto.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvc implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration loginIt = registry.addInterceptor(new MyInterceptor());

        loginIt.addPathPatterns("/user/**");
        loginIt.excludePathPatterns("/user/login");
    }

}
