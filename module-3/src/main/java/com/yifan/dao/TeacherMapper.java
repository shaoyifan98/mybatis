package com.yifan.dao;

import com.yifan.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

    List<Teacher> getTeacherById(@Param("id") int id);
}
