package com.zx5435.controllers;

import com.zx5435.models.dao.CompanyCustomerDAO;
import com.zx5435.models.entity.CompanyCustomerDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class NewsTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Autowired
    CompanyCustomerDAO companyCustomerDAO;

    @Test
    public void html() {
        String cc = this.testRestTemplate.getForObject("/cc", String.class);

        System.out.println(cc);
    }

    @Test
    public void info() {
        List<CompanyCustomerDO> res = companyCustomerDAO.findAllRange(5, 5);

        System.out.println("res = " + res);

        Assert.assertEquals(5, res.size());
    }

}