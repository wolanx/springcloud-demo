package com.zx5435.controllers;

import com.zx5435.config.LogUtil;
import com.zx5435.config.LogConfig;
import com.zx5435.pcmoto.common.model.base.User;
import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
public class UserController {

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/user")
    public String index(Model m) {
        m.addAttribute("username", request.getSession().getAttribute("uid"));

        return "user/index";
    }

    @RequestMapping("/user/login")
    public String login(Model m) {
        String method = request.getMethod();

        User user = new User();

        LogConfig.log.info("method = " + method);
        LogUtil.info("user = " + user);

//        log.info("qwe");

        if ("POST".equals(method)) {
            String username = request.getParameter("username");
            System.out.println("username = " + username);

            request.getSession().setAttribute("uid", username);
            return "redirect:/user?" + username;
        }

        return "user/login";
    }

    @RequestMapping("/user/logout")
    public String logout(Model m) {
        String id = request.getSession().getId();
        String s = request.changeSessionId();
        System.out.println("id = " + id);
        System.out.println("s = " + s);

        request.getSession().removeAttribute("uid");
        return "redirect:/user/login";
    }

}
