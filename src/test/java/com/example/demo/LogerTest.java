package com.example.demo;

import org.omg.CORBA.Object;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/11/21.
 */
public class LogerTest {
    static Logger logger = LoggerFactory.getLogger(LogerTest.class);
    public static void main(String[] args) {

        String str = "abc";
        logger.info("str : " + str);
        logger.info("str:{}",str);

        Map<String,String> map = new HashMap<>();
        map.put("a","12");
        map.put("b","13");
        logger.info("map : {}" ,map);

        map = null;
        logger.info("map : {}" ,map);
    }
}