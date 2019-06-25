package com.zx5435.pcmoto.news.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BadRequestHttpException extends RuntimeException {

    private int code = 1;

    public BadRequestHttpException(String message) {
        super(message);
    }

    public BadRequestHttpException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
