package com.example.pattern.结构型模式.适配器模式;

/**
 * @author liwen
 */
public interface Targetable {
    /**
     * 目标方法
     */
    void method2();

    /**
     * 与原有方法相同
     */
    void method1();
}
