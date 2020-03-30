package com.springboot2.demojdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoJdbcApplicationTests {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
    }


    @Test
    public void testDbType() {
        System.out.println("自动装配数据源的类型:"+dataSource.getClass());
    }
   @Test
    public void testJdbcTemplate() {
        List<Map<String,Object>> employeeList = jdbcTemplate.queryForList("select * from type");
        System.out.println(employeeList.size());
    }
}
