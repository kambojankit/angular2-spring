package com.techarha.java.manin.business.impl;

import com.techarha.java.manin.business.UserManager;
import com.techarha.java.manin.dao.UserManagerDao;
import com.techarha.java.manin.domain.UserEntity;
import com.techarha.java.manin.request.AddUserRequest;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * Created by ankit on 04/10/15.
 */

@Component("userManager")
public class UserManagerImpl implements UserManager{

    @Autowired
    private UserManagerDao userManagerDao;

    @Override
    public boolean addUser(AddUserRequest adduserrequest) {

        UserEntity userEntity = new UserEntity();
        userEntity.setName("Ank");
        userEntity.setCity("chd");
        userEntity.setDateOfBirth(new Timestamp(new DateTime().getMillis()));
        userEntity.setEmail("ank@gmail.com");
        userEntity.setGender("m");
        userEntity.setHome("123");
        userEntity.setPhone("1231231231");

        Integer id = userManagerDao.create(userEntity);
        System.out.println(id);
        return true;
    }
}
