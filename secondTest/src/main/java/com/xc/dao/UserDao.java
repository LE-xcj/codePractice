package com.xc.dao;

import com.xc.pojo.User;

import java.util.List;

public interface UserDao {
    void insert(User user) throws Exception;

    List<User> select(String username) throws  Exception;
}
