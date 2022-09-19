package com.example.pattern.桥接模式;

/**
 * @author liwen
 */
public class MyBridge extends Bridge{
    @Override
    public void method() {
        getSource().method();
    }
}
