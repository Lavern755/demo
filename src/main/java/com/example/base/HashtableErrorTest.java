package com.example.base;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author liwen
 *
 * 知识点：尽量不是使用可变对象作为HashMap和Hashtable的key。如果确实需要，也尽量不要修改作为key的可变对象
 */
public class HashtableErrorTest {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(new A(60000), "疯狂java讲义");
        hm.put(new A(87563), "轻量级Java EE企业应用实战");
        Iterator iterator = hm.keySet().iterator();

        // 第一个对象的count，原值是60000，修改为87563
        A first = (A) iterator.next();
        first.count = 87563;
        System.out.println(hm);

        // 第一次删除
        hm.remove(new A(87563));
        System.out.println(hm);

        // 第二次无法删除
        hm.remove(87563);
        System.out.println(hm);

        // 结果都是null
        System.out.println(hm.get(87563));
        System.out.println(hm.get(60000));

        // 即使把count改回60000,依然无法获取
        iterator = hm.keySet().iterator();
        A getFirst = (A) iterator.next();
        getFirst.count = 60000;
        System.out.println(hm.get(60000));

        // 使用迭代器可以删除
        iterator.remove();
        System.out.println(hm);
    }
}
