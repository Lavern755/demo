package com.example.pattern.简单工厂模式.多方法简单工厂;

/**
 * @author liwen
 */
public class SmsSender implements Sender {
    @Override
    public void send(String msg) {
        System.out.println("sms msg: " + msg);
    }
}
