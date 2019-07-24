package com.zx5435.pcmoto.admin.controllers;

import com.zx5435.pcmoto.admin.dao.UserDao;
import com.zx5435.pcmoto.admin.entity.UserDO;
import com.zx5435.pcmoto.admin.util.Util;
import com.zx5435.pcmoto.common.base.User;
import com.zx5435.pcmoto.common.mylib.MyException;
import lombok.extern.slf4j.Slf4j;
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

    @Autowired
    UserDao userDao;

    @RequestMapping("/user")
    public String index(Model m) {
        m.addAttribute("username", request.getSession().getAttribute("uid"));

        return "user/index";
    }

    @RequestMapping("/user/login")
    public String login(Model m) {
        String method = request.getMethod();

        User user = new User();

        // from
        if ("POST".equals(method)) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            log.info("username = {}, password = [{}]", username, password);

            UserDO dbUser = userDao.findOneByUsername(username);
            if (dbUser == null) {
                m.addAttribute("error", "帐号不存在");
                return "user/login";
            }
            String pwd1 = dbUser.getPassword();
            String pwd2 = Util.calcPwd(password, dbUser.getSalt());
            if (!pwd1.equals(pwd2)) {
                m.addAttribute("error", "密码错误");
                return "user/login";
            }

            request.getSession().setAttribute("uid", username);

            return "redirect:/user?logged=" + username;
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
