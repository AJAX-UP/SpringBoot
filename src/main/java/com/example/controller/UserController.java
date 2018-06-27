package com.example.controller;

import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ucmed on 2018/6/26.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello,Spring Boot";
    }
    @RequestMapping(value = "/insert1")
    public String insert() {
        userService.insert();
        return "hello,Spring Boot";
    }

}
