package com.zx5435.pcmoto.demo;

import lombok.Data;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Query;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * 裸 hibernate demo
 * code conf
 * 注释 mapper
 *
 * @implNote https://www.w3cschool.cn/hibernate/ugov1ie8.html
 */
public class HibernateDemo {

    public static void main(String[] args) {
        // conf
        Configuration conf = new Configuration();
        conf.setProperty("hibernate.connection.url", "jdbc:mysql://zx5435.com:3306/mt-dev?characterEncoding=UTF-8");
        conf.setProperty("hibernate.connection.username", "root");
        conf.setProperty("hibernate.connection.password", "12341234");

        // SessionFactory Session
        SessionFactory sf = conf
                .addAnnotatedClass(MtUser.class)  // !!!
                .addAnnotatedClass(NewsModel.class)
                .buildSessionFactory();
        Session s = sf.openSession();

        // query
        List u = s.createQuery("from mt_user").list();
        for (Object o : u) {
            System.out.println("o = " + o);
        }

        // query build
        Criteria criteria = s.createCriteria(MtUser.class);
        criteria.add(Restrictions.eq("id", 2));
        List list = criteria.list();
        System.out.println("list = " + list);

        // UPDATE DELETE INSERT
        if (false) {
            String hql = "UPDATE Employee set salary = :salary WHERE id = :employee_id";
            Query query = s.createQuery(hql);
            query.setParameter("salary", 1000);
            query.setParameter("employee_id", 10);
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);
        }

        // 原生 SQL 1 标量查询  map
        String sql = "SELECT id,title FROM mt_news limit 10,10";
        NativeQuery q1 = s.createSQLQuery(sql);
        q1.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List n1 = q1.list();
        for (Object asd : n1) {
            HashMap asd1 = (HashMap) asd;
            System.out.println("aaa = " + asd1.get("title"));
        }

        // 原生 SQL 2 实体查询
        NativeQuery q2 = s.createSQLQuery(sql);
        q2.addEntity(NewsModel.class); // !!!
        List n2 = q2.list();
        for (Object o : n2) {
            NewsModel o2 = (NewsModel) o;
            System.out.println("bbb = " + o2.getId());
        }

        // 不关闭，为守护进程
        sf.close();
    }

}

@Data
@Entity
@Table(name = "NewsModel")
class NewsModel implements Serializable {
    @Id
    private int id;

    @Override
    public String toString() {
        return "NewsModel{" +
                "id=" + id +
                '}';
    }
}

@Data
@Entity
@Table(name = "MtUser")
class MtUser {
    @Id
    private int id;
    private String username;

    @Override
    public String toString() {
        return "MtUser{" +
                "id=" + id +
                '}';
    }
}
