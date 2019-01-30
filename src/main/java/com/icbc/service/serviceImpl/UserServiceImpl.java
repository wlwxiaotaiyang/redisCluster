package com.icbc.service.serviceImpl;

import com.icbc.dao.UserMapper;
import com.icbc.pojo.User;
import com.icbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
       return userMapper.getUserList();
    }
}
