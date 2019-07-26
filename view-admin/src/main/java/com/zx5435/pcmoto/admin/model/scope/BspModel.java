package com.zx5435.pcmoto.admin.model.scope;


import com.zx5435.pcmoto.admin.entity.CompanyBspDO;
import org.apache.ibatis.jdbc.SQL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

public class BspModel<T> {

   @Autowired
   EntityManager entityManager;

    public static void main(String[] args) {
        rrrrr();
    }

    public static void rrrrr() {
        BspModel<CompanyBspDO> a = new BspModel<>();

        BspModel<CompanyBspDO> b = a.find();

        List<CompanyBspDO> all = b.all();

        System.out.println("all = " + all);
    }

    public BspModel<T> find() {
        return this;
    }

    public List<T> all() {
        String sql = new SQL()
                .SELECT("*")
                .FROM("user")
                .toString();

        System.out.println("sql = " + sql);

        List list = entityManager.createQuery(sql).getResultList();

        System.out.println("list = " + list);

        return new ArrayList<>();
    }

}
