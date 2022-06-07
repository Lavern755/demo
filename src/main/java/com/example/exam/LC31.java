package com.example.exam;

import java.util.Arrays;

/**
 * [1,2,3]、[1,3,2]、[2,1,3]、[2,3,1]、[3,1,2]、[3,2,1]
 *
 * [1,2,3,4]、[1,2,4,3]、[1,3,2,4]、[1,3,4,2]、[1,4,2,3]、[1,4,3,2]
 * [2,1,3,4]、[2,1,4,3]、[2,3,1,4]、[2,3,4,1]、[2,4,1,3]、[2,4,3,1]
 * [3,1,2,4]、[3,1,4,2]、[3,2,1,4]、[3,2,4,1]、[3,4,1,2]、[3,4,2,1]
 * [4,1,2,3]、[4,1,3,2]、[4,2,1,3]、[4,2,3,1]、[4,3,1,2]、[4,3,2,1]
 */
public class LC31 {
    public static void main(String[] args) {
        LC31 lc31 = new LC31();
        int[] nums = {5,4,7,5,3,2};
        // [5, 5, 2, 3, 4, 7]
        lc31.nextPermutation(nums);

        int[] nums2 = {2,3,1};
        lc31.nextPermutation(nums2);
    }
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        // 查找需要交换的位置
        int pos = -1;
        int last = nums[nums.length - 1];
        for (int i = nums.length -1; i >= 0 ; i--) {
            int cur = nums[i];
            if (cur < last) {
                pos = i;
                break;
            }else {
                last = cur;
            }
        }

        // 降序排列变为升序排列
        if (pos == -1) {
            Arrays.sort(nums);
            return;
        }

        // 第一个大于pos的值所在的索引
        int index = -1;
        for (int i = pos + 1; i < nums.length; i++) {
            int cur = nums[i];
            if (cur <= nums[pos]) {
                index = i - 1;
                break;
            }
        }
        index = index == -1 ? nums.length - 1 : index;

        // 交换值
        swap(nums, pos, index);
        for (int i = pos + 1; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int cur = nums[i];
                int next = nums[j];
                if (cur > next) {
                    swap(nums, i, j);
                }
            }
        }
    }

    private void swap(int[] nums, int pos, int index) {
        int oldValue = nums[pos];
        nums[pos] = nums[index];
        nums[index] = oldValue;
    }
}
