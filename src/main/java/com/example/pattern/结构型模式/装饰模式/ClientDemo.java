package com.example.pattern.结构型模式.装饰模式;

/**
 * 装饰器模式，实现对方法的增强
 *
 * @author liwen
 */
public class ClientDemo {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Decorator decorator = new Decorator(source);
        decorator.method();
    }
}
