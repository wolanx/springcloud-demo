package com.zx5435.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorPageAction {
    @RequestMapping(value = "/error400Page")
    public String error400Page() {
        return "error/404";
    }

    @RequestMapping(value = "/error401Page")
    public String error401Page() {
        return "error/401";
    }

    @RequestMapping(value = "/error404Page")
    public String error404Page(Model model) {
        model.addAttribute("code", "6666666");
        model.addAttribute("msg", "服务器降级中......");
        return "error/404";
    }

    @RequestMapping(value = "/error500Page")
    public String error500Page(Model model) {
        return "error/500";
    }

}
