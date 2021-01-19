package com.example.mybaits.service.impl;

import com.example.mybaits.entity.User;
import com.example.mybaits.mapper.UserMapper;
import com.example.mybaits.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> allUser() {
        return userMapper.allUser();
    }
}
