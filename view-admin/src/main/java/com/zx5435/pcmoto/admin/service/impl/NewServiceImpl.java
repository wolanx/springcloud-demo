package com.zx5435.pcmoto.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zx5435.pcmoto.admin.dao.NewsDao;
import com.zx5435.pcmoto.admin.entity.UserDO;
import com.zx5435.pcmoto.admin.mapper.NewsMapper;
import com.zx5435.pcmoto.admin.entity.NewsDO;
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
    public List getList() {
//        List<NewsDO> arr = newsDao.findAll();
        List<NewsDO> arr = newsDao.findAllByCidOrderByViewsDesc(598);

        log.info("get::arr");
//        System.out.println(arr);

        LambdaQueryWrapper<NewsDO> ge = new QueryWrapper<NewsDO>()
                .lambda()
                .lt(NewsDO::getCid, 137);

        List<NewsDO> a = newsMapper.selectList(ge);
        System.out.println("a = " + a);

        return a;
    }
}
