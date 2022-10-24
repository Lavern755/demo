package com.example.pattern.行为型模式.解释器模式;

/**
 * 解释器模式是我们暂时的最后一讲，一般主要应用在 OOP 开发中的编译器的开发中，所以适用面比较
 * 窄。
 * @author liwen
 */
public class ExpressionDemo {
    public static void main(String[] args) {
        int result = new Minus().interpret(new Context(new Plus().interpret(new Context(9, 2)), 8));
        System.out.println(result);
    }
}
