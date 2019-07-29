package com.zx5435.pcmoto.admin.model.scope;


import com.zx5435.pcmoto.admin.model.base.CompanyBspDO;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class BspModel<T> {

    @PersistenceContext
    EntityManager entityManager;

    public BspModel<T> find() {
        return this;
    }

    @SuppressWarnings("unchecked")
    public List<CompanyBspDO> all() {
        String sql = new SQL()
                .SELECT("*")
                .WHERE("id > 50 and id < 60")
                .ORDER_BY("id desc")
                .FROM("company_bsp")
                .toString();

        Query query = entityManager.createNativeQuery(sql, CompanyBspDO.class);

        List<CompanyBspDO> list = query.getResultList();
        System.out.println("bspArr = " + list.size());

        return list;
    }

}
