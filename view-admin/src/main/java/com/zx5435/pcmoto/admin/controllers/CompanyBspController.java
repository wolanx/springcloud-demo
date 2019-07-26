package com.zx5435.pcmoto.admin.controllers;

import com.zx5435.pcmoto.admin.dao.CompanyBspDao;
import com.zx5435.pcmoto.admin.entity.CompanyBspDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import java.util.List;

@Controller
@RequestMapping("company-bsp")
public class CompanyBspController {

    @Autowired
    CompanyBspDao companyBspDao;

    @Autowired
    EntityManager entityManager;

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
//            System.out.println("one = " + one.getTsCreate());
        }
        m.addAttribute("arr", arr);

        System.out.println("entityManager = " + entityManager);

//        Query query = entityManager.createNativeQuery("select * from user");
//        List list = query.getResultList();
//        System.out.println("singleResult = " + list);

//        BspModel.rrrrr();

        return "company-bps/index";
    }

}
