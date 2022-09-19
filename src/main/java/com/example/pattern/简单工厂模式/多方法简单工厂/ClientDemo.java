package com.example.pattern.简单工厂模式.多方法简单工厂;

/**
 * @author liwen
 */
public class ClientDemo {
    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender sender1 = factory.produceMailSender();
        sender1.send("解放Taiwan");

        Sender sender2 = factory.produceSmsSender();
        sender2.send("解放Taiwan");
    }
}
