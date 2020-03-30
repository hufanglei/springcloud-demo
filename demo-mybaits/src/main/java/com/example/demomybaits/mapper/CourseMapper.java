package com.example.demomybaits.mapper;

import com.example.demomybaits.entity.CourseEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {

    List<CourseEntity> list();


}
