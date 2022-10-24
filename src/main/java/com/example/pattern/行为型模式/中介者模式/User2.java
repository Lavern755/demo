package com.example.pattern.行为型模式.中介者模式;

/**
 * @author liwen
 */
public class User2 extends User {
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 work()");
    }
}
