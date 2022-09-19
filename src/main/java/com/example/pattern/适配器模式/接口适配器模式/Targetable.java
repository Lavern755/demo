package com.example.pattern.适配器模式.接口适配器模式;

/**
 * @author liwen
 */
public interface Targetable {
    /**
     * 与原有类的中的方法相同
     */
    void method1();

    /**
     * 新类中的方法
     */
    void method2();
}
