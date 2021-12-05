package com.yifan.dao;

import com.yifan.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperAnnotationTest {
    @Test
    public void test1(){
        SqlSession ss =  MyBatisUtils.getSqlSession();

        try {
            UserMapperAnnotation userMapper = ss.getMapper(UserMapperAnnotation.class);

            System.out.println(userMapper.getUserById(1));

        }catch (Exception e){

        }finally {
            ss.close();
        }
    }
}
