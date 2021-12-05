package com.yifan.dao;

import com.yifan.pojo.User;
import com.yifan.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {

    @Test
    public void test1(){
        SqlSession ss =  MyBatisUtils.getSqlSession();

        try {
            UserMapper userMapper = ss.getMapper(UserMapper.class);

            System.out.println(userMapper.getUserList());

        }catch (Exception e){

        }finally {
            ss.close();
        }
    }

    @Test
    public void test2(){
        SqlSession ss =  MyBatisUtils.getSqlSession();

        try {
            UserMapper userMapper = ss.getMapper(UserMapper.class);

            System.out.println(userMapper.getUserById(1));

        }catch (Exception e){

        }finally {
            ss.close();
        }
    }

    @Test
    public void test3(){
        SqlSession ss =  MyBatisUtils.getSqlSession();

        try {
            UserMapper userMapper = ss.getMapper(UserMapper.class);

            int res = userMapper.addUser(new User("yifan", "24", "12345", 1));
            ss.commit();
            if(res > 0){
                System.out.println("added");
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ss.close();
        }
    }

    @Test
    public void test4(){
        SqlSession ss =  MyBatisUtils.getSqlSession();

        try {
            UserMapper userMapper = ss.getMapper(UserMapper.class);

            int res = userMapper.updateUser(new User("lux", "24", "12345", 1));
            ss.commit();
            if(res > 0){
                System.out.println("updated");
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ss.close();
        }
    }

    @Test
    public void test5(){
        SqlSession ss =  MyBatisUtils.getSqlSession();

        try {
            UserMapper userMapper = ss.getMapper(UserMapper.class);

            int res = userMapper.deleteUser(2);
            ss.commit();
            if(res > 0){
                System.out.println("deleted");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ss.close();
        }
    }
}
