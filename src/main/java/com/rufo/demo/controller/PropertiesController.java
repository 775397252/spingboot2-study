package com.rufo.demo.controller;

import com.rufo.demo.properties.MyProperties1;
import com.rufo.demo.properties.MyProperties2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController{
    private static final Logger log = LoggerFactory.getLogger(PropertiesController.class);

    @Autowired
    private MyProperties1 myProperties1;
    @Autowired
    private MyProperties2 myProperties2;

    @RequestMapping("/hello")
    public String index() {
        return "Hello Wossrwwld";
    }

    @RequestMapping("/test")
    public MyProperties1 myProperties1() {
        log.info("===================================myProperties1==============================================================");
        log.info(myProperties1.toString());
        log.info("=================================================================================================");
        log.info("===================================myProperties2==============================================================");
        log.info(myProperties2.toString());
        log.info("=================================================================================================");
        return myProperties1;
    }
}
