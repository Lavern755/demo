package com.example.base;

import java.util.HashMap;

/**
 * @author liwen
 */
public class NullInHashmap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(null, null);
        map.put(null, null);
        map.put("a", null);
        System.out.println(map);
    }
}
