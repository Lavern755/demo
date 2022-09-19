package com.example.pattern.简单工厂模式.静态方法简单工厂;

/**
 * @author liwen
 */
public class SenderFactory {
    public static Sender produceMailSender() {
        return new Mailsender();
    }

    public static Sender produceSmsSender() {
        return new SmsSender();
    }
}
