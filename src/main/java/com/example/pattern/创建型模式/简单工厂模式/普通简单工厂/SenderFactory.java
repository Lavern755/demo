package com.example.pattern.创建型模式.简单工厂模式.普通简单工厂;

/**
 * @author liwen
 */
public class SenderFactory {
    public Sender produceSender(String senderType) {
        if ("mail".equals(senderType)) {
            return new Mailsender();
        }else if ("sms".equals(senderType)){
            return new SmsSender();
        }else {
            throw new RuntimeException();
        }
    }
}
