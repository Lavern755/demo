package com.example.pattern.中介者模式;

/**
 * @author liwen
 */
public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
