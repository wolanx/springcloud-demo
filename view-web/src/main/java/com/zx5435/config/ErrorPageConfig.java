package com.zx5435.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ErrorPageConfig implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        ErrorPage e400 = new ErrorPage(HttpStatus.BAD_REQUEST, "/error/500");
        ErrorPage e401 = new ErrorPage(HttpStatus.UNAUTHORIZED, "/error/500");
        ErrorPage e404 = new ErrorPage(HttpStatus.NOT_FOUND, "/error/404");
        ErrorPage e500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error/500");

        registry.addErrorPages(e400, e401, e404, e500);
    }

}

