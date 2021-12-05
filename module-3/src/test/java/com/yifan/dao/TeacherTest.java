package com.yifan.dao;


import com.yifan.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

public class TeacherTest {
    private static final Logger logger = Logger.getLogger(TeacherTest.class);
    @Test
    public void testGetTeacherById(){
        SqlSession ss =  MyBatisUtils.getSqlSession();
        TeacherMapper teacherMapper = ss.getMapper(TeacherMapper.class);
        System.out.println(teacherMapper.getTeacherById(1));
        ss.close();

    }
}
