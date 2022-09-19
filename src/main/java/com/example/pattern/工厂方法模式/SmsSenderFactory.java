package com.example.pattern.工厂方法模式;

/**
 * @author liwen
 */
public class SmsSenderFactory implements SenderFactory{
    @Override
    public Sender produceSender() {
        return new SmsSender();
    }
}
