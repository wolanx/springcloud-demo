package com.zx5435.pcmoto.admin.controllers;

import com.zx5435.pcmoto.admin.dao.UserDao;
import com.zx5435.pcmoto.admin.entity.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/user")
    public String index(Model m) {
        log.info("user");

        Page<UserDO> res = userDao.findAll(PageRequest.of(0, 20));
        List<UserDO> content = res.getContent();

        System.out.println("res = " + res);
        System.out.println("content = " + content);

        m.addAttribute("res", content);
        m.addAttribute("page", res.getPageable());

        System.out.println("res = " + res.getPageable());

        return "user/index";
    }

}
