package com.example.pattern.行为型模式.观察者模式;

/**
 * @author liwen
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received");
    }
}
