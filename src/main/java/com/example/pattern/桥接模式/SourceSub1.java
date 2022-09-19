package com.example.pattern.桥接模式;

public class SourceSub1 implements Sourceable{
    @Override
    public void method() {
        System.out.println("SourceSub1 method");
    }
}
