package com.rufo.demo.controller;

import com.github.pagehelper.PageHelper;
import com.rufo.demo.entity.User;
import com.rufo.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("user/insert")
    public String insertUser() {
        User user=new User("www","daas");
        userMapper.insert(user);
        return "ok";
    }

    @GetMapping("user/list")
    public List<User> getUserPage() {
        PageHelper.startPage(1,5);
        List<User> list= userMapper.findUser();
        return list;
    }

}
