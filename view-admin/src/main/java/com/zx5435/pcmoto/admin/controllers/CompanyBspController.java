package com.zx5435.pcmoto.admin.controllers;

import com.zx5435.pcmoto.admin.dao.CompanyBspDao;
import com.zx5435.pcmoto.admin.entity.CompanyBspDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("company-bsp")
public class CompanyBspController {

    @Autowired
    CompanyBspDao companyBspDao;

    @RequestMapping("index")
    public HashMap index() {
        HashMap<Object, Object> o = new HashMap<>();
        o.put("asd", 123);
        List<CompanyBspDO> arr = companyBspDao.findAll();
        o.put("zxc", arr);

        for (CompanyBspDO one : arr) {
            System.out.println("one = " + one.getTsCreate());
        }

        return o;
    }

}
