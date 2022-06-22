package com.example.base;

/**
 * @author liwen
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        // java.lang.Object@4517d9a3
        System.out.println(obj.toString());
        // 1159190947
        System.out.println(obj.hashCode());
        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());
        System.out.println(Integer.toHexString(1159190947));

        Number n = 0;
        Class<? extends Number> c = n.getClass();
        System.out.println(c.getClass());
    }
}
