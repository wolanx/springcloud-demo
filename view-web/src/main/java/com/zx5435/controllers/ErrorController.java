package com.zx5435.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

    @RequestMapping(value = "/error/500")
    public String error500Page(Model model) {
        return "error/500";
    }

}
