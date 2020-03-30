package com.springboot.demo1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//1.Spring Boot快速开始及核心功能介绍

@SpringBootApplication
//public class Demo1Application extends SpringBootServletInitializer {
//@EnableWebMvc
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(Demo1Application.class);
//    }

}
