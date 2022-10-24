package com.example.pattern.行为型模式.策略模式;

/**
 * @author liwen
 */
public class Plus extends AbstractCaculator implements ICalculator {
    /**
     * 具体的子类，重写模板方法中延后到子类实现的方法
     * @param exp
     * @return
     */
    @Override
    public int calculate(String exp) {
        int[] arrInt = split(exp, "\\+");
        return arrInt[0] + arrInt[1];
    }
}
