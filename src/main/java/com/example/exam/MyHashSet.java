package com.example.exam;

import java.util.LinkedList;

/**
 * 自定义设计HashSet
 *
 * @author liwen
 *
 * 提示：
 * 0 <= key <= 106
 * 最多调用 104 次 add、remove 和 contains
 */
public class MyHashSet {
    /**
     * 定义底层数组的大小，用于Hash函数计算
     */
    private final static int size = 1000;

    /**
     * 定义底层链表的大小。java8之后的底层结构是红黑树+链表定义底层链表的大小。java8之后的底层结构是红黑树+链表
     */
    private LinkedList<Integer>[] arr;

    /**
     * 初始化操作
     */
    public MyHashSet() {
        // 初始化数组大小，也就是桶大小
        arr = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            // 每个数组元素都是链表
            arr[i] = new LinkedList<>();
        }
    }

    /**
     * 添加操作，不能添加重复的元素
     * @param key
     */
    public void add(int key) {
        // 计算hash值，获取bucket的编号，也就是数组索引
        int hash = key % size;
        LinkedList values = arr[hash];
        // 如果对应位置不包含对于的值，则添加到对应位置
        if (!values.contains(key)){
            values.add(key);
        }
    }

    /**
     * 删除操作
     * @param key
     */
    public void remove(int key) {
        // 计算hash值
        int hash = key % size;
        LinkedList<Integer> values = arr[hash];
        for (int index = 0; index < values.size(); index++) {
            // 遍历元素的值，删除对应的值
            if (values.get(index).equals(key)) {
                // 注意是index，而不是value
                values.remove(index);
            }
        }
    }

    /**
     * 是否包含
     * @param key
     * @return
     */
    public boolean contains(int key) {
        // 计算hash值
        int hash = key % size;
        LinkedList values = arr[hash];
        return values.contains(key);
    }
}