package com.example.base;

import java.util.Hashtable;

/**
 * @author liwen
 *
 * 知识点： 如果某个对象作为HashMap和Hashtable的key，则重写equals方法和hashCode方法的结果保持一致
 *
 */
public class HashTableTest {
    public static void main(String[] args) {
        Hashtable ht= new Hashtable();
        ht.put(new A(60000), "疯狂java讲义");
        ht.put(new A(87563), "轻量级Java EE企业应用实战");
        ht.put(new A(1232), new B());
        System.out.println(ht);

        // containsValue仅仅通过equals比较，相等则返回true，因为B的equals方法始终返回true，所以结果为true
        System.out.println(ht.containsValue("测试字符串"));

        // A的equals和hashCode方法都返回true，所以结果为true
        System.out.println(ht.containsKey(new A(87563)));
        ht.remove(new A(1232));
        System.out.println(ht);
    }
}

class A {
    int count;

    public A(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        A a = (A) o;
        return count == a.count;
    }

    @Override
    public int hashCode() {
        return this.count;
    }
}

class B {
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
