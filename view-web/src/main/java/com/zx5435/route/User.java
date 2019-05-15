package com.zx5435.route;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User {

    @RequestMapping("/user")
    public String index(Model m) {
        m.addAttribute("username", "sdssss");

        return "user/index";
    }

}
