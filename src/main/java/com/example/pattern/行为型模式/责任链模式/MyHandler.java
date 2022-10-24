package com.example.pattern.行为型模式.责任链模式;

/**
 * @author liwen
 */
public class MyHandler extends AbstractHandler implements Handler{
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    /**
     * 核心逻辑
     */
    @Override
    public void operator() {
        System.out.println(name + "deal");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
