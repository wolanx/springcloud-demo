package com.zx5435.pcmoto.demo;

import lombok.Data;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Query;
import javax.persistence.Table;
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

        Configuration conf = new Configuration();
        conf.setProperty("hibernate.connection.url", "jdbc:mysql://zx5435.com:3306/mt-dev?characterEncoding=UTF-8");
        conf.setProperty("hibernate.connection.username", "root");
        conf.setProperty("hibernate.connection.password", "12341234");
        SessionFactory f = conf
                .addAnnotatedClass(mt_user.class)
                .buildSessionFactory();

        Session s = f.openSession();

        List u = s.createQuery("from mt_user").list();

        for (Object o : u) {
            System.out.println("o = " + o);
        }

        // UPDATE DELETE INSERT
        if (false) {
            String hql = "UPDATE Employee set salary = :salary WHERE id = :employee_id";
            Query query = s.createQuery(hql);
            query.setParameter("salary", 1000);
            query.setParameter("employee_id", 10);
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);
        }

        f.close();
    }

}

@Data
@Entity
@Table(name = "mt_user")
class mt_user {

    @Id
    private int id;
    private String username;

    @Override
    public String toString() {
        return "mt_user{" +
                "id=" + id +
                '}';
    }
}
