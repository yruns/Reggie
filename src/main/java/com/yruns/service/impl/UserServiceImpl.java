package com.yruns.service.impl;

import com.yruns.mapper.UserMapper;
import com.yruns.pojo.User;
import com.yruns.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User getOne(String phone) {
        return userMapper.selectOneUserByPhone(phone);
    }

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }
}
