package com.springboot2.demojdbc.controller;
import com.springboot2.demojdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService test;

    @RequestMapping("/test")
    public Integer test(){
        return  test.testJdbcTemplate();
    }
}
