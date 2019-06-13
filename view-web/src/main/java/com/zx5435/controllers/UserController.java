package com.zx5435.controllers;

import com.zx5435.pcmoto.model.base.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/user")
    public String index(Model m) {
        m.addAttribute("username", "sdssss");

        return "user/index";
    }

    @RequestMapping("/user/login")
    public String login(Model m) {
        String method = request.getMethod();
        System.out.println("method = " + method);

        User user = new User();
        System.out.println("user = " + user);

        if ("POST".equals(method)) {
            String username = request.getParameter("username");
            System.out.println("username = " + username);
            if ("qwe".equals(username)) {
                request.getSession().setAttribute("sid", username);
                return "redirect:/user?" + username;
            }
        }

        return "user/login";
    }

}
