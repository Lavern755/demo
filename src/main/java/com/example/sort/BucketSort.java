package com.example.sort;

import java.util.Arrays;

/**
 * @author liwen
 */
public class BucketSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 5, 2, 8};
        BucketSort.bucketSort(arr);
    }


    private static void bucketSort(int[] scores) {
        /**
         * The value of the scores is the index of ans
         */
        int[] ans = new int[11];
        for (int i = 0; i < scores.length; i++) {
            ans[scores[i]] = ans[scores[i]] + 1;
        }

        System.out.println(Arrays.toString(ans));
    }

}
