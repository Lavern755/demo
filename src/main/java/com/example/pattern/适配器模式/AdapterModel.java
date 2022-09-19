package com.example.pattern.适配器模式;

/**
 * 类的适配器模式
 *
 * @author liwen
 */
public class AdapterModel implements Targetable {
    private Source source;

    public void setSource(Source source) {
        this.source = source;
    }

    @Override
    public void method2() {
        System.out.println("AdapterModel method2");
    }

    @Override
    public void method1() {
        source.method1();
    }
}
