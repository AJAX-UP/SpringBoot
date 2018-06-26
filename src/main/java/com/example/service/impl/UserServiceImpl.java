package com.example.service.impl;

import com.example.dao.UserMapper;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ucmed on 2018/6/26.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void insert() {
        User user=new User();
        user.setId(3);
        user.setName("ucmed");
        user.setPassword("123456");
        userMapper.insert(user);
    }
}
