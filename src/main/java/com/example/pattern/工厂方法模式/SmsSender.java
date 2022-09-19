package com.example.pattern.工厂方法模式;

/**
 * @author liwen
 */
public class SmsSender implements Sender {
    @Override
    public void send(String msg) {
        System.out.println("sms msg: " + msg);
    }
}
