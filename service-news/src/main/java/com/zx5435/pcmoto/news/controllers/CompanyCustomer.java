package com.zx5435.pcmoto.news.controllers;

import com.zx5435.pcmoto.news.models.dao.CompanyCustomerDAO;
import com.zx5435.pcmoto.news.models.entity.CompanyCustomerDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyCustomer {

    @Autowired
    Environment environment;

    @Autowired
    CompanyCustomerDAO companyCustomerDAO;

    @GetMapping(value = "/cc")
    public Object list(@RequestParam(value = "page", defaultValue = "1") int page,
                       @RequestParam(value = "per-page", defaultValue = "20") int pageSize) {
        String s = environment.getProperty("spring.datasource.password");
        System.out.println("s = " + s);

        int offset = (page - 1) * pageSize;

        List<CompanyCustomerDO> list = companyCustomerDAO.findAllRange(offset, pageSize);
        System.out.println("list = " + list);

        return list;
    }

}
