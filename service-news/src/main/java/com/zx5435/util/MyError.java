package com.zx5435.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.LinkedHashMap;

@ControllerAdvice
public class MyError {

//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public LinkedHashMap<String, Object> handler(Exception e) {
//        LinkedHashMap<String, Object> m = new LinkedHashMap<>();
//        m.put("status", 200);
//        m.put("code", 0);
//        m.put("message", e.getMessage());
//
//        System.out.println("m = " + m);
//
//        return m;
//    }
//

}
