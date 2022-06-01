package com.example.base;

import java.util.ArrayDeque;

/**
 * @author liwen
 */
public class ArrayDequeStack {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("疯狂java讲义");
        stack.push("轻量级javaEE企业级应用");
        stack.push("疯狂andriod讲义");
        System.out.println(stack);
        // 栈：先进后出
        System.out.println(stack.peek());
        // 证明peek没有弹栈操作
        System.out.println(stack);
        System.out.println(stack.pop());
        // 弹栈操作
        System.out.println(stack);
    }
}
