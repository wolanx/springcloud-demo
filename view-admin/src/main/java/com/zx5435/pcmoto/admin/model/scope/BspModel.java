package com.zx5435.pcmoto.admin.model.scope;


import com.zx5435.pcmoto.admin.entity.CompanyBspDO;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

public class BspModel<T> {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

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
//        DetachedCriteria.forClass();
//        JpaQueryCreator jpaQueryCreator = new JpaQueryCreator();

        SQL sql = new SQL()
                .SELECT("*")
                .FROM("user");

        System.out.println("sql = " + sql);

        System.out.println(entityManagerFactory);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        CriteriaBuilder b = entityManagerFactory.getCriteriaBuilder();
//        b.createQuery().


        List list = entityManager.createQuery(sql.toString()).getResultList();
        System.out.println("list = " + list);

        return new ArrayList<>();
    }

}
