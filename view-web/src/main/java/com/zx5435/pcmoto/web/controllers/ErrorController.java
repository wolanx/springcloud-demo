package com.zx5435.pcmoto.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

    @RequestMapping(value = "/error/404")
    public String a404(Model m) {
        m.addAttribute("exception");

        System.out.println("404 = " + 123);

        return "error/404";
    }

    @RequestMapping(value = "/error/500")
    public String error500Page(Model m) {
        m.addAttribute("exception");

        System.out.println("500 = " + 123);

        return "error/500";
    }

}
