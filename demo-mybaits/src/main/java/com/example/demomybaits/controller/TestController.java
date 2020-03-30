package com.example.demomybaits.controller;
import com.example.demomybaits.entity.CourseEntity;
import com.example.demomybaits.entity.Type;
import com.example.demomybaits.mapper.CourseMapper;
import com.example.demomybaits.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping("/test1")
    public List<CourseEntity> getTest1(){
        return courseMapper.list();
    }

    @RequestMapping("/test2/{id}")
    public Type getTest2(@PathVariable Integer id){
        return employeeMapper.findOne(id);
    }

}
