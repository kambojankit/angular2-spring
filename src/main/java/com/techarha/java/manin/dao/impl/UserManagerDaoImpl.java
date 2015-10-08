package com.techarha.java.manin.dao.impl;


import com.techarha.java.manin.dao.UserManagerDao;
import com.techarha.java.manin.domain.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * Created by ankit on 28/03/15.
 */
@Component("userManagerDao")
public class UserManagerDaoImpl implements UserManagerDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public boolean createUser() {
        Session session = sessionFactory.openSession();
        Transaction tx=session.beginTransaction();

        UserEntity userEntity = new UserEntity();
        userEntity.setName("Ank");
        userEntity.setCity("chd");
        userEntity.setDateOfBirth(new Timestamp(new DateTime().getMillis()));
        userEntity.setEmail("ank@gmail.com");
        userEntity.setGender("m");
        userEntity.setHome("123");
//        userEntity.setId(1);
        userEntity.setPhone("1231231231");

        session.saveOrUpdate(userEntity);
        tx.commit();
        session.close();
        return true;
    }
}
