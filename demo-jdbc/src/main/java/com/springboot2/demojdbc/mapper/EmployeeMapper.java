//package com.springboot2.demojdbc.mybatis;
//
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Select;
//
//@Mapper
//public interface EmployeeMapper {
//
//    @Select("select * from employee")
//    List<Employee> list();
//
//    @Select("select * from employee where id=#{id}")
//    Employee findOne(Integer id);
//
//    @Options(useGeneratedKeys =true,keyProperty = "id")
//    @Insert("insert into employee(last_name,email,gender,dept_id)values(#{lastName},#{email},#{gender},#{deptId})")
//    int save(Employee employee);
//
//}​