package com.example.exam;

/**
 * @author liwen
 */
public class LC1523 {
    public int countOdds(int low, int high) {
        if ((high - low + 1) % 2  == 0) {
            return (high - low + 1) / 2;
        }
        return (high - low + 1) / 2 + (high % 2 == 0 ? 0 : 1);
    }

    public static void main(String[] args) {
        LC1523 lc1523 = new LC1523();
        System.out.println(lc1523.countOdds(8, 10));
        System.out.println(lc1523.countOdds(11, 11));
    }
}
