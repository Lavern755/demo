package com.example.pattern.适配器模式.接口适配器模式;

/**
 * @author liwen
 */
public class SourceSub1 extends Wrapper2{
    @Override
    public void method1() {
        System.out.println("SourceSub1 method1");
    }
}
