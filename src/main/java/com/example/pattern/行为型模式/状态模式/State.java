package com.example.pattern.行为型模式.状态模式;

/**
 * @author liwen
 */
public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1() {
        System.out.println("execute the first opt");
    }

    public void method2() {
        System.out.println("execute the second opt");
    }
}
