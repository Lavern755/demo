package com.example.pattern.简单工厂模式.静态方法简单工厂;

/**
 * @author liwen
 */
public class ClientDemo {
    public static void main(String[] args) {
        Sender sender1 = SenderFactory.produceMailSender();
        sender1.send("解放Taiwan");

        Sender sender2 = SenderFactory.produceSmsSender();
        sender2.send("解放Taiwan");
    }
}
