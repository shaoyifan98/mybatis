package com.yifan.dao;

import com.yifan.pojo.Student;
import com.yifan.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    List<Student> getStudentsInfo();

    List<Student> getStudentsInfo2();

}
