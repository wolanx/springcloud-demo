package com.zx5435.config;

import com.zx5435.mylib.Util;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) {
        ModelAndView m = new ModelAndView("site/error");
        m.addObject("exception", e.getMessage());

        System.out.println("GlobalExceptionAdvice: " + e.getMessage());
        System.out.println("Util.ver = " + Util.ver);

        return m;
    }

}
