package com.he.service.impl;

import com.he.mapper.UserMapper;
import com.he.pojo.User;
import com.he.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public void addUser(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
