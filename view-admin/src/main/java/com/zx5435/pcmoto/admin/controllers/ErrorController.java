package com.zx5435.pcmoto.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

    /**
     * 假 error
     * 实际源码 BasicErrorController
     */
    @RequestMapping("/error-fake")
    public String error(Model m) {
        m.addAttribute("timestamp"); // "timestamp" -> "Mon Jul 08 19:41:03 CST 2019"
        m.addAttribute("status"); // 500
        m.addAttribute("error"); // Internal Server Error
        m.addAttribute("message"); // qwe
        m.addAttribute("path", "/news/info"); // /news/info

        return "error";
    }

    @RequestMapping("/error/test")
    public String test() throws Exception {
        if (true) {
            throw new Exception("呵呵阿达");
        }
        return "error/test";
    }

}
