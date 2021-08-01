package com.he.service;

import com.he.pojo.User;

import java.util.List;

public interface UsersService {
    void addUser(User user);

    List<User> selectAll();
}
