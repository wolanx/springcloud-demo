package com.zx5435.route;

import com.zx5435.model.base.CompanyCustomerDO;
import com.zx5435.model.dao.CompanyCustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyCustomer {

    @Autowired
    Environment environment;

    @Autowired
    CompanyCustomerDAO companyCustomerDAO;

    @GetMapping(value = "/cc")
    public Object list() {
        String s = environment.getProperty("spring.datasource.password");
        System.out.println("s = " + s);

        List<CompanyCustomerDO> list = companyCustomerDAO.list();
        System.out.println("list = " + list);

        return list;
    }

}
