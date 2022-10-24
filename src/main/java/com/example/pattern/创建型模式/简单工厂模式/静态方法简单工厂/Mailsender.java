package com.example.pattern.创建型模式.简单工厂模式.静态方法简单工厂;

/**
 * @author liwen
 */
public class Mailsender implements Sender {
    @Override
    public void send(String msg) {
        System.out.println("mail msg: " + msg);
    }
}
