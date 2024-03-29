package com.example.pattern.行为型模式.责任链模式;

/**
 * @author liwen
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
