package com.yifan.dao;

import com.yifan.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapperAnnotation {

    //use Param to indiciate the param
    //by doing so, function can receive multiple params
    @Select("select * from user where id = #{id}")
    List<User> getUserById(@Param("id") int id);
}
