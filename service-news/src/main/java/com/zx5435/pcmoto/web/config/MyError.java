package com.zx5435.pcmoto.web.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.LinkedHashMap;

@ControllerAdvice
public class MyError {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public LinkedHashMap<String, Object> base(Exception e) {
        LinkedHashMap<String, Object> m = new LinkedHashMap<>();
        m.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        m.put("code", 1);
        m.put("message", e.getMessage());

        System.out.println("m = " + m);

        return m;
    }

    @ExceptionHandler(NotFoundHttpException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public LinkedHashMap<String, Object> e404(NotFoundHttpException e) {
        LinkedHashMap<String, Object> m = new LinkedHashMap<>();
        m.put("name", HttpStatus.NOT_FOUND);
        m.put("message", e.getMessage());
        m.put("code", e.getCode());
        m.put("status", HttpStatus.NOT_FOUND.value());
        m.put("previous", e.getCause());

        return m;
    }

    @ExceptionHandler(BadRequestHttpException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public LinkedHashMap<String, Object> e500(BadRequestHttpException e) {
        LinkedHashMap<String, Object> m = new LinkedHashMap<>();
        m.put("name", HttpStatus.INTERNAL_SERVER_ERROR);
        m.put("message", e.getMessage());
        m.put("code", e.getCode());
        m.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        m.put("previous", e.getCause());

        return m;
    }

}
