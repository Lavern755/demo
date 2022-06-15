package com.example.base;

import java.util.WeakHashMap;

/**
 * @author liwen
 *
 * WeakHashMap的用法
 */
public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap whm = new WeakHashMap<>();
        // 匿名字符串
        whm.put(new String("语文"), new String("良好"));
        whm.put(new String("数学"), new String("及格"));
        whm.put(new String("英语"), new String("中等"));

        // 该key是一个系统缓存的字符串对象
        whm.put("java", new String("中等"));

        System.out.println(whm);
        // 通知系统立即进行垃圾回收
        System.gc();
        System.runFinalization();

        System.out.println(whm);
    }
}
