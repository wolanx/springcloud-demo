package com.zx5435.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String index(Model m) {
        m.addAttribute("username", "sdssss");

        return "user/index";
    }

    @RequestMapping("/user/login")
    public String login(Model m) {
        return "user/login";
    }

}
