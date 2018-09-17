package com.rufo.demo.controller;

import com.rufo.demo.entity.User;
import com.rufo.demo.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    private static final Logger log = LoggerFactory.getLogger(TestController.class);

//    @RequestMapping("/ggg")
//    public String index() {
////        Optional<WpPost> post = wpPostRepository.findById((long) 1);
//        Optional<WpPost> post = wpPostRepository.findById((long) 1);
//        return "dd";
//    }
    @RequestMapping("/userssss")
    public String index() {
        List<User> users= userMapper.findByUsername("u1");
        for(User user : users) {//其内部实质上还是调用了迭代器遍历方式，这种循环方式还有其他限制，不建议使用。
            log.info("[根据用户名查询] - [{}]", user.getUsername());
        }
        return "请查看控制台";
    }
    @RequestMapping("/insert")
    public Integer insert_user() {
        int insert = userMapper.insert(new User("u2", "p2"));
        return insert;
    }

//    @RequestMapping("/page")
//    public Integer page() {
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        final PageInfo<Object> pageInfo = PageHelper.startPage(1, 10)
//                .setOrderBy("id desc")
//                .doSelectPageInfo(() -> this.userMapper.selectAll());
//        log.info("[lambda写法] - [分页信息] - [{}]", pageInfo.toString());
//        PageHelper.startPage(1, 10).setOrderBy("id desc");
//        final PageInfo<User> userPageInfo = new PageInfo<>(this.userMapper.selectAll());
//        log.info("[普通写法] - [{}]", userPageInfo);
//        return 11;
//    }


}
