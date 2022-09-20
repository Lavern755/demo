package com.example.pattern.责任链模式;

/**
 * 此处强调一点就是，链接上的请求可以是一条链，可以是一个树，还可以是一个环，模式本身不约束这
 * 个，需要我们自己去实现，同时，在一个时刻，命令只允许由一个对象传给另一个对象，而不允许传给
 * 多个对象。
 * @author liwen
 */
public class HandlerDemo {
    public static void main(String[] args) {
        MyHandler handler1 = new MyHandler("h1");
        MyHandler handler2 = new MyHandler("h2");
        MyHandler handler3 = new MyHandler("h3");

        /**
         * 链的构建也可以隐藏起来，对用户不可见
         */
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        handler1.operator();
    }
}
