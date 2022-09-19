package com.example.pattern.工厂方法模式;

/**
 * @author liwen
 */
public class WexinSender implements Sender{
    @Override
    public void send(String msg) {
        System.out.println("weixin msg: " + msg);
    }
}
