package com.techarha.java.manin.dao.impl;

import com.techarha.java.manin.dao.FlipkartOrdersDao;
import com.techarha.java.manin.domain.FlipkartOrderEntity;
import com.techarha.java.manin.domain.FlipkartTransEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ankit on 19/11/15.
 */
@Component("flipkartOrdersDao")
public class FlipkartOrdersDaoImpl implements FlipkartOrdersDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<FlipkartOrderEntity> getAllOrdersDetails() {
        List<FlipkartOrderEntity> flipkartOrderEntities;
        Session session = sessionFactory.openSession();

        Criteria criteria = session.createCriteria(FlipkartOrderEntity.class);
        flipkartOrderEntities = criteria.list();

        return flipkartOrderEntities;
    }

    @Override
    public Integer create(FlipkartOrderEntity newInstance) {
        return null;
    }

    @Override
    public FlipkartOrderEntity read(Integer id) {
        return null;
    }

    @Override
    public void update(FlipkartOrderEntity transientObject) {

    }

    @Override
    public void delete(FlipkartOrderEntity persistentObject) {

    }
}
