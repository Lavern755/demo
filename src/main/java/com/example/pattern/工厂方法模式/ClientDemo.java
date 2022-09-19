package com.example.pattern.工厂方法模式;

/**
 * @author liwen
 */
public class ClientDemo {
    public static void main(String[] args) {
        MailSenderFactory mailSenderFactory = new MailSenderFactory();
        Sender sender1 = mailSenderFactory.produceSender();
        sender1.send("解放Taiwan");

        SmsSenderFactory smsSenderFactory = new SmsSenderFactory();
        Sender sender2 = smsSenderFactory.produceSender();
        sender2.send("解放Taiwan");

        WexinSenderfactory wexinSenderfactory = new WexinSenderfactory();
        Sender sender3 = wexinSenderfactory.produceSender();
        sender3.send("解放Taiwan");
    }
}
