package com.techarha.java.ecomm.dao.impl;

import com.techarha.java.ecomm.dao.UserManagerDao;
import com.techarha.java.ecomm.domain.User;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ankit on 28/03/15.
 */
@Component("userManagerDao")
public class UserManagerDaoImpl implements UserManagerDao{

    @Override
    public User fetchUserById(Integer id) {
        User user = new User();

        user.setId(124);
        user.setName("Demo User");
        user.setBirthDate(new DateTime());
        user.setCity("Demo city");
        user.setEmail("demouser@demoemail.com");
        user.setState("DemoState");

        return user;
    }

    @Override
    public List fetchAllUsers() {
        return null;
    }

    @Override
    public void insertUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }
}
