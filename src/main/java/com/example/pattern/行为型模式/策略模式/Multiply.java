package com.example.pattern.行为型模式.策略模式;

/**
 * @author liwen
 */
public class Multiply extends AbstractCaculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] arrInt = split(exp, "\\*");
        return arrInt[0] * arrInt[1];
    }
}
