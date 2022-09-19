package com.example.pattern.策略模式;

/**
 * @author liwen
 */
public class Minus extends AbstractCaculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] arrInt = split(exp, "-");
        return arrInt[0] - arrInt[1];
    }
}
