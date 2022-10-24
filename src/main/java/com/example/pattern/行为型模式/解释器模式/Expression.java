package com.example.pattern.行为型模式.解释器模式;

/**
 * @author liwen
 */
public interface Expression {
    /**
     * 算法
     * @param context
     * @return
     */
    int interpret(Context context);
}
