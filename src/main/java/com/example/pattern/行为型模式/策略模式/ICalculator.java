package com.example.pattern.行为型模式.策略模式;

/**
 * @author liwen
 */
public interface ICalculator {

    /**
     * 抽象策略
     * @param exp
     * @return
     */
    public int calculate(String exp);
}
