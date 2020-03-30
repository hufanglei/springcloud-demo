package com.springboot2.demojdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public int testJdbcTemplate() {
        List<Map<String,Object>> employeeList = jdbcTemplate.queryForList("select * from type");

        System.out.println(employeeList.size());
        return employeeList.size();
    }

}
