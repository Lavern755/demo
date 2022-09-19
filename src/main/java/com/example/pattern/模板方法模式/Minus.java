package com.example.pattern.模板方法模式;

/**
 * @author liwen
 */
public class Minus extends AbstractCalculator{
    /**
     * 具体的子类，重写模板方法中延后到子类实现的方法
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}
