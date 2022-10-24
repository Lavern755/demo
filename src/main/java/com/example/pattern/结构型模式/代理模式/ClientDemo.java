package com.example.pattern.结构型模式.代理模式;

/**
 * 代理模式：对方法进行增强
 *
 *   装饰器模式通常的做法是将原始对象作为一个参数传给装饰者的构造器，而代理模式通常在一个代理类中创建一个被代理类的对象。
 *   装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。（两者都是结构型设计模式）
 *
 * @author liwen
 */
public class ClientDemo {
    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}
