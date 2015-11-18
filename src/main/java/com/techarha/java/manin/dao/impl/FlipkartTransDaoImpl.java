package com.techarha.java.manin.dao.impl;

import com.techarha.java.manin.dao.FlipkartTransDao;
import com.techarha.java.manin.domain.FlipkartTransEntity;
import com.techarha.java.manin.domain.UserEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ankit on 18/11/15.
 */
@Component("flipkartTransDao")
public class FlipkartTransDaoImpl implements FlipkartTransDao {
    @Autowired
    SessionFactory sessionFactory;


    @Override
    public Integer create(FlipkartTransEntity newInstance) {
        return null;
    }

    @Override
    public FlipkartTransEntity read(Integer id) {
        return null;
    }

    @Override
    public void update(FlipkartTransEntity transientObject) {

    }

    @Override
    public void delete(FlipkartTransEntity persistentObject) {

    }

    @Override
    public List<FlipkartTransEntity> getAllTrasactionDetails(){
        List<FlipkartTransEntity> flipkartTransEntities;
        Session session = sessionFactory.openSession();

        Criteria criteria = session.createCriteria(FlipkartTransEntity.class);
        flipkartTransEntities = criteria.list();

        return flipkartTransEntities;
    }
}
