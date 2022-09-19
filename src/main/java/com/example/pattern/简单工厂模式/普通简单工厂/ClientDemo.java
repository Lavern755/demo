package com.example.pattern.简单工厂模式.普通简单工厂;

/**
 * @author liwen
 */
public class ClientDemo {
    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produceSender("mail");
        sender.send("解放Taiwan");
    }
}
