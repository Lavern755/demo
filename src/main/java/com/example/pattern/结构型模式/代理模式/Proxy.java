package com.example.pattern.结构型模式.代理模式;

/**
 * @author liwen
 */
public class Proxy implements Sourceable {
    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }


    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void after() {
        System.out.println("after proxy");
    }

    private void before() {
        System.out.println("before proxy");
    }
}
