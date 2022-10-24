package com.example.pattern.行为型模式.策略模式;

/**
 * @author liwen
 */
public class AbstractCaculator {

    public int[] split(String exp, String opt) {
        String[] arr = exp.split(opt);
        int[] arrInt = new int[2];
        arrInt[0] = Integer.parseInt(arr[0]);
        arrInt[1] = Integer.parseInt(arr[1]);
        return arrInt;
    }
}
