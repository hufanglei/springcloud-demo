package com.example.demo2.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Spring Boot快速集成第三方技术详解

//以redis为例来了解自动装配与非自动装配的区别
//1.导入本地的bean.xml
// (locations="classPath:beans.xml")
//@ImportResource(locations = "classpath:beans.xml") 可以导入xml的配置文件
//--------------------------------------------
//2种注入方式，1种按条件注入方式:ioc
//3.自动装配的原理图


@SpringBootApplication
//@ImportResource(locations = "classpath:beans.xml")
public class Demo2Application {


    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }


}
