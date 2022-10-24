package com.example.pattern.行为型模式.观察者模式;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author liwen
 */
public abstract class AbstractSubject implements Subject {
    /**
     * 订阅者列表，注意线程安全用的是Vector
     */
    private Vector<Observer> observerList = new Vector<>();

    /**
     * 添加订阅者
     * @param observer
     */
    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 删除订阅者
     * @param observer
     */
    @Override
    public void del(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知订阅者
     */
    @Override
    public void notifyObservers() {
        Enumeration<Observer> elements = observerList.elements();
        while (elements.hasMoreElements()) {
            elements.nextElement().update();
        }
    }

    /**
     * 抽象方法让子类实现扩展
     */
    public abstract void operation();
}
