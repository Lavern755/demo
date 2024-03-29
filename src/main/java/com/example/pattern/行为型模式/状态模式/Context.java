package com.example.pattern.行为型模式.状态模式;

/**
 * @author liwen
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method() {
        if (state.getValue().equals("state1")) {
            state.method1();
        }else if (state.getValue().equals("state2")) {
            state.method2();
        }
    }
}
