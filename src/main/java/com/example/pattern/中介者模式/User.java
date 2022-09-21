package com.example.pattern.中介者模式;

/**
 * @author liwen
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 工作
     */
    public abstract void work();
}
