package com.yifan.dao;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Log4JTest {
    private static final Logger logger = Logger.getLogger(Log4JTest.class);
    @Test
    public void test1(){
        logger.info("info test");
        logger.debug("debug test");
        logger.error("error test");
    }
}
