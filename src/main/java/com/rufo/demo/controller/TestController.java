package com.rufo.demo.controller;

import com.rufo.demo.entity.User;
import com.rufo.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

//    @RequestMapping("/ggg")
//    public String index() {
////        Optional<WpPost> post = wpPostRepository.findById((long) 1);
//        Optional<WpPost> post = wpPostRepository.findById((long) 1);
//        return "dd";
//    }
    @RequestMapping("/user_pass")
    public String index() {
        User user= userMapper.findByUsername("rufo");
        return "::";
    }

    @RequestMapping("/insert_user")
    public Integer insert_user() {
        int insert = userMapper.insert(new User((long) 122,"u2", "p2"));
        return insert;
    }


}
