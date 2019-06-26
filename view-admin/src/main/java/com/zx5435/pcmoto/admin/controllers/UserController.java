package com.zx5435.pcmoto.admin.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class UserController {

//    @Autowired
//    UserCrud userCrud;

    @RequestMapping("/user")
    public String index() {
        log.info("user");

//        Page<User> all = userCrud.findAll(PageRequest.of(1, 20));
//        System.out.println("all = " + all);

        return "user/index";
    }

}
