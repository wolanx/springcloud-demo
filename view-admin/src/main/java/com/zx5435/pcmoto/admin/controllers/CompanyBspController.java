package com.zx5435.pcmoto.admin.controllers;

import com.zx5435.pcmoto.admin.dao.CompanyBspDao;
import com.zx5435.pcmoto.admin.entity.CompanyBspDO;
import com.zx5435.pcmoto.admin.model.scope.BspModel;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Controller
@RequestMapping("company-bsp")
public class CompanyBspController {

    @Autowired
    CompanyBspDao companyBspDao;

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    BspModel bspModel;

    @RequestMapping("index")
    public String index(Model m) {
        List<CompanyBspDO> arr3 = companyBspDao.findAll();

        List<CompanyBspDO> arr = companyBspDao.findAll(
                new Example<CompanyBspDO>() {
                    @Override
                    public CompanyBspDO getProbe() {
                        CompanyBspDO o = new CompanyBspDO();
                        o.setPinyin("b");
                        return o;
                    }

                    @Override
                    public ExampleMatcher getMatcher() {
                        return ExampleMatcher.matching()
                                .withMatcher("pinyin", ExampleMatcher.GenericPropertyMatcher::contains);
                    }
                },
                new Sort(Sort.Direction.DESC, "id"));

        for (CompanyBspDO one : arr) {
            System.out.println("one = " + one.getTsCreate());
        }

        List<CompanyBspDO> all = bspModel.all();
        m.addAttribute("arr", all);

        return "company-bps/index";
    }

}
