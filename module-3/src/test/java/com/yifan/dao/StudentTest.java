package com.yifan.dao;

import com.yifan.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class StudentTest {
    @Test
    public void test1(){
        SqlSession ss =  MyBatisUtils.getSqlSession();
        StudentMapper studentMapper = ss.getMapper(StudentMapper.class);
        System.out.println(studentMapper.getStudentsInfo());
        ss.close();
    }

    @Test
    public void test2(){
        SqlSession ss =  MyBatisUtils.getSqlSession();
        StudentMapper studentMapper = ss.getMapper(StudentMapper.class);
        System.out.println(studentMapper.getStudentsInfo2());
        ss.close();
    }
}
