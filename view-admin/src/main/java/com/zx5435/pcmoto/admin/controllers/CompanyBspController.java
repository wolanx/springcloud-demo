package com.zx5435.pcmoto.admin.controllers;

import com.zx5435.pcmoto.admin.dao.CompanyBspDao;
import com.zx5435.pcmoto.admin.entity.CompanyBspDO;
import com.zx5435.pcmoto.admin.model.scope.BspModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("company-bsp")
public class CompanyBspController {

    @Autowired
    CompanyBspDao companyBspDao;

    @RequestMapping("index")
    public String index(Model m) {
        List<CompanyBspDO> arr = companyBspDao.findAll();

        for (CompanyBspDO one : arr) {
//            System.out.println("one = " + one.getTsCreate());
        }
        m.addAttribute("arr", arr);

        BspModel.rrrrr();

        return "company-bps/index";
    }

}
