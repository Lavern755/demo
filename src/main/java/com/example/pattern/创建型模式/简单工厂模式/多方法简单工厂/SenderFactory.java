package com.example.pattern.创建型模式.简单工厂模式.多方法简单工厂;

/**
 * @author liwen
 */
public class SenderFactory {
    public Sender produceMailSender() {
        return new Mailsender();
    }

    public Sender produceSmsSender() {
        return new SmsSender();
    }
}
