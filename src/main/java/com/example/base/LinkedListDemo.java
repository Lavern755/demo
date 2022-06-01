package com.example.base;

import java.util.LinkedList;

/**
 * @author liwen
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> books = new LinkedList<>();
        books.offer("疯狂java讲义");
        books.push("轻量级javaEE企业应用实战");
        books.offerFirst("疯狂Android讲义");
        books.forEach(System.out::println);
        // 栈顶元素
        System.out.println(books.peekFirst());
        System.out.println(books.peekLast());
        System.out.println(books.pop());
        System.out.println(books.pollLast());
    }
}
