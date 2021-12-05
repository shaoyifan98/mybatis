package com.yifan.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 建立mybatis连接的工具类
 */
public class MyBatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    //加载资源
    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = null;
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //返回sqlsession
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession(true);
    }

}
