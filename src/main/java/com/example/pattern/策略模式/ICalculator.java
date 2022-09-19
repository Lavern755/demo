package com.example.pattern.策略模式;

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
