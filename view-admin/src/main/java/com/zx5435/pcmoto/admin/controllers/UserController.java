package com.zx5435.pcmoto.admin.controllers;

import com.zx5435.pcmoto.admin.dao.UserDao;
import com.zx5435.pcmoto.admin.entity.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/user")
    public String index() {
        log.info("user");

        Page<UserDO> all = userDao.findAll(PageRequest.of(1, 20));
        System.out.println("all = " + all);
        List<UserDO> content = all.getContent();
        System.out.println("content = " + content);

        return "user/index";
    }

}
