package com.techarha.java.ecomm.dao;

import com.techarha.java.ecomm.domain.User;

import java.util.List;

/**
 * Created by ankit on 28/03/15.
 */
public interface UserManagerDao {
    public User fetchUserById(Integer id);
    public List fetchAllUsers();
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
}