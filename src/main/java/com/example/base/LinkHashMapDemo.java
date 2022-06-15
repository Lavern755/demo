package com.example.base;

import java.util.LinkedHashMap;

/**
 * @author liwen
 */
public class LinkHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap scores = new LinkedHashMap();
        scores.put("Chinese", 80);
        scores.put("English", 82);
        scores.put("Mathematics", 76);

        // 打印
        scores.forEach((key,value) -> System.out.println(key + " = " + value));
    }
}
