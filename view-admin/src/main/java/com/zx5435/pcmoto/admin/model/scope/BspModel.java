package com.zx5435.pcmoto.admin.model.scope;


import com.zx5435.pcmoto.admin.entity.CompanyBspDO;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Component
public class BspModel<T> {

    @PersistenceContext
    EntityManager entityManager;

    public BspModel<T> find() {
        return this;
    }

    public List<CompanyBspDO> all() {
        String sql = new SQL()
                .SELECT("*")
                .FROM("company_bsp")
                .ORDER_BY("id desc")
                .toString();

        Query query = entityManager.createNativeQuery(sql, CompanyBspDO.class);
        List<CompanyBspDO> list = query.getResultList();
        System.out.println("bspArr = " + list);

        return list;
    }

}
