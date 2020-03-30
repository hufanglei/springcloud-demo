package com.springboot2.demojdbc;

import com.springboot2.demojdbc.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class DemoJdbcApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoJdbcApplication.class, args);
        System.out.println(context.getBean("userService"));
        UserService test = (UserService) context.getBean("userService");
        test.testJdbcTemplate();

    }

}
