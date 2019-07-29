package com.zx5435.pcmoto.admin.controllers;

import com.zx5435.pcmoto.admin.model.base.CompanyBspDO;
import com.zx5435.pcmoto.admin.model.jpa.CompanyBspDao;
import com.zx5435.pcmoto.admin.model.scope.BspModel;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("company-bsp")
public class CompanyBspController {

    @Resource
    CompanyBspDao companyBspDao;

    @Resource
    BspModel bspModel;

    @RequestMapping("index")
    public String index(Model m, @RequestParam(defaultValue = "") String sort) {
        System.out.println("sort = " + sort);

        // 方式一 jpa Example
        List<CompanyBspDO> arr1 = companyBspDao.findAll(
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

        // 方式二 native sql
        List<CompanyBspDO> arr2 = bspModel.getArrRawSql();

        // 方式三
        List<CompanyBspDO> arr3 = bspModel.getCb();

        m.addAttribute("arr", arr3);

        return "company-bps/index";
    }

}
