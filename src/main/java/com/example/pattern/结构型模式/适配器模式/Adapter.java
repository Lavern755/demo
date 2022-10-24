package com.example.pattern.结构型模式.适配器模式;

/**
 * 类的适配器模式
 *  adapter是Targetable的接口，但是具有了source的能力
 * @author liwen
 */
public class Adapter extends Source implements Targetable{
    @Override
    public void method2() {
        System.out.println("marketable method2");
    }
}
