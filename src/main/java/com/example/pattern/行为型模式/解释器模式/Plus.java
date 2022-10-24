package com.example.pattern.行为型模式.解释器模式;

/**
 * @author liwen
 */
public class Plus implements Expression{
    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
