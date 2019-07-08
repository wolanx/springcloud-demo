package com.zx5435.pcmoto.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * error 源码 BasicErrorController
 */
@Controller
public class ErrorController {

    @RequestMapping("/error-fake")
    public String error(Model m) {
        m.addAttribute("timestamp"); // "timestamp" -> "Mon Jul 08 19:41:03 CST 2019"
        m.addAttribute("status"); // 500
        m.addAttribute("error"); // Internal Server Error
        m.addAttribute("message"); // qwe
        m.addAttribute("path", "/news/info"); // /news/info

        return "error";
    }

//    @ExceptionHandler(value = NoHandlerFoundException.class)
//    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", e);
//        mav.addObject("url", req.getRequestURL());
//        mav.setViewName("error/error");
//        return mav;
//    }

}
