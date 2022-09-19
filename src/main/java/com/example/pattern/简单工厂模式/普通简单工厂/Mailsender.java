package com.example.pattern.简单工厂模式.普通简单工厂;

/**
 * @author liwen
 */
public class Mailsender implements Sender{
    @Override
    public void send(String msg) {
        System.out.println("mail msg: " + msg);
    }
}
