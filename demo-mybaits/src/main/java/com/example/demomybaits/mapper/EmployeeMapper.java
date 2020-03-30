package com.example.demomybaits.mapper;
import com.example.demomybaits.entity.Type;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface EmployeeMapper {
    @Select("select * from type")
    List<Type> list();

    @Select("select * from type where id=#{id}")
    Type findOne(Integer id);

    @Options(useGeneratedKeys =true,keyProperty = "id")
    @Insert("insert into type(name)values(#{name})")
    int save(Type employee);
}
