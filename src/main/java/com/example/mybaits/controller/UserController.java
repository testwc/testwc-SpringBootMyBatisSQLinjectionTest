package com.example.mybaits.controller;

import com.example.mybaits.entity.User;
import com.example.mybaits.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/test")
    public List<User> allUser(){
        return userService.allUser();
    }
}
