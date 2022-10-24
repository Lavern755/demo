package com.example.pattern.结构型模式.装饰模式;

/**
 * @author liwen
 */
public class Decorator implements Sourceable {
    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    @Override
    public void method() {
        System.out.println("before decorator");
        sourceable.method();
        System.out.println("after decorator");
    }
}
