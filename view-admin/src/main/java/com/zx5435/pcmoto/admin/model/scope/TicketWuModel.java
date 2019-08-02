package com.zx5435.pcmoto.admin.model.scope;


import com.zx5435.pcmoto.admin.model.base.TicketWuDO;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class TicketWuModel {

    @PersistenceContext
    EntityManager entityManager;

//    public TicketWuModel<T> find() {
//        return this;
//    }

    @SuppressWarnings("unchecked")
    public List<TicketWuDO> all() {
        String sql = new SQL()
                .SELECT("*")
//                .WHERE("id > 50 and id < 60")
                .ORDER_BY("id desc")
                .FROM("ticket_wu")
                .toString();

        Query query = entityManager.createNativeQuery(sql, TicketWuDO.class);

        List<TicketWuDO> list = query.getResultList();
        System.out.println("twuArr = " + list.size());

        return list;
    }

}
