package com.example.base;

import java.util.TreeMap;

/**
 * @author liwen
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(new R(3), "轻量级JAVA EE企业应用实战");
        tm.put(new R(-5), "疯狂Java讲义");
        tm.put(new R(9), "疯狂Android讲义");
        System.out.println(tm);

        System.out.println(tm.firstEntry());
        System.out.println(tm.lastKey());

        System.out.println(tm.higherKey(new R(2)));
        System.out.println(tm.lowerKey(new R(2)));

        System.out.println(tm.subMap(new R(-1), new R(4)));
    }
}


class R implements Comparable {
    int count;

    public R(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "R[count: " + count + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        R r = (R) o;
        return count == r.count;
    }

    @Override
    public int compareTo(Object o) {
        R r = (R) o;
        return count > r.count ? 1 : count < r.count ? -1 : 0;
    }
}