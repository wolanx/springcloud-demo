package com.zx5435.pcmoto.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx5435.pcmoto.admin.model.jpa.NewsDao;
import com.zx5435.pcmoto.admin.model.base.NewsDO;
import com.zx5435.pcmoto.admin.model.plus.NewsMapper;
import com.zx5435.pcmoto.admin.service.NewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class NewServiceImpl implements NewService {

    @Autowired
    NewsDao newsDao;

    @Autowired
    NewsMapper newsMapper;

    @Override
    public List<NewsDO> getList() {
//        List<NewsDO> arr = newsDao.findAll();
        List<NewsDO> arr = newsDao.findAllByCidOrderByViewsDesc(598);

        log.info("get::arr");
//        System.out.println(arr);

        LambdaQueryWrapper<NewsDO> ge = new QueryWrapper<NewsDO>()
                .lambda()
                .lt(NewsDO::getCid, 137);

        log.info(ge.getSqlSelect());

        IPage<NewsDO> p = newsMapper.selectPage(new Page<>(0, 5), ge);
        List<NewsDO> a = p.getRecords();
        System.out.println("p.getPages() = " + p.getPages());
        System.out.println("p.getSize() = " + p.getSize());
        System.out.println("p.getTotal() = " + p.getTotal());

        return a;
    }
}
