package com.example.base;

import java.util.ArrayDeque;

/**
 * @author liwen
 */
public class ArrayDequeQueue {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.offer("疯狂java讲义");
        queue.offer("轻量级javaEE企业级应用");
        queue.offer("疯狂andriod讲义");

        // 队列： 先进先出
        System.out.println(queue);
        // 返回第一个元素，不弹栈
        System.out.println(queue.peek());
        System.out.println(queue);

        // 取出第一个元素并弹栈
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
