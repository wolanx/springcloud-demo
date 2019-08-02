package com.zx5435.pcmoto.admin.model.scope;


import com.zx5435.pcmoto.admin.model.base.CompanyBspDO;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
public class BspModel {

    @PersistenceContext
    EntityManager entityManager;

//    public BspModel<T> find() {
//        return this;
//    }

    @SuppressWarnings("unchecked")
    public List<CompanyBspDO> getArrRawSql() {
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

    public List<CompanyBspDO> getCb() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();


        CriteriaQuery<CompanyBspDO> q = cb.createQuery(CompanyBspDO.class);


        TypedQuery<CompanyBspDO> tq = entityManager.createQuery(q);
        List<CompanyBspDO> arr = tq.getResultList();

//        cb.gt(from.get());
        System.out.println("arr = " + arr);

        return arr;
    }

}
