package com.example.exam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author liwen
 */
public class LC1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (valueMap.containsKey(target - nums[i])) {
                return new int[] {valueMap.get(target - nums[i]), i};
            }else {
                valueMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
//        int[] nums = {3,2,4};
//        int target = 6;
//        int[] nums = {3,3};
//        int target = 6;
        LC1 lc1 = new LC1();
        System.out.println(Arrays.toString(lc1.twoSum(nums, target)));
    }
}
