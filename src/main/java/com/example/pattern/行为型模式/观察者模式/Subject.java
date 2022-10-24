package com.example.pattern.行为型模式.观察者模式;

/**
 * @author liwen
 */
public interface Subject {
    /**
     * 添加订阅者
     * @param observer
     */
    void add(Observer observer);

    /**
     * 移除订阅者
     * @param observer
     */
    void del(Observer observer);

    /**
     * 通知所有订阅者
     */
    void notifyObservers();

    /**
     * 自身的操作
     */
    void operation();
}
