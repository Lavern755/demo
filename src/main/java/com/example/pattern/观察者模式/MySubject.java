package com.example.pattern.观察者模式;

/**
 * @author liwen
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update myself");
        // 通知所有的订阅者
        notifyObservers();
    }
}
