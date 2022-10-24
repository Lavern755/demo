package com.example.pattern.结构型模式.代理模式;

/**
 * @author liwen
 */
public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("original method");
    }
}
