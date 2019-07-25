package com.zx5435.pcmoto.admin.model.scope;


import cn.hutool.db.sql.Order;
import com.zx5435.pcmoto.admin.entity.CompanyBspDO;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.query.criteria.internal.CriteriaBuilderImpl;
import org.hibernate.sql.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.JpaQueryCreator;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

public class BspModel<T> {

    @Autowired
    Session session;

    public static void main(String[] args) {
        BspModel<CompanyBspDO> a = new BspModel<>();

        BspModel<CompanyBspDO> b = a.find();

        List<CompanyBspDO> all = b.all();

        System.out.println("all = " + all);
    }

    public BspModel<T> find() {
        return this;
    }

    public List<T> all() {
//        DetachedCriteria.forClass();
//        JpaQueryCreator jpaQueryCreator = new JpaQueryCreator();

        return new ArrayList<>();
    }

}
