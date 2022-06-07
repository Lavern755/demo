package com.example.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // 特殊情况
        List<List<Integer>> quadruplets = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return quadruplets;
        }
        // 一定要排序
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length - 3; i++) {
            // 不可有重复值
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // 最小数之和大于target，则不用继续查找
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }

            // 最后三个是最大数，如果小于目标值，则移动i
            if ((long) nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
                continue;
            }

            // num[i]加上最大的三个数，结果大于等于target
            for (int j = i + 1; j < length - 2; j++) {
                // 不可有重复值
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // 对应的最小值已经大于target，则结束查找
                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    break;
                }

                // nums[i] + nums[length - 2] + nums[length - 1固定，变动 nums[j]
                if ((long) nums[i] + nums[j] + nums[length - 2] + nums[length - 1] < target) {
                    continue;
                }

                // 二分查找
                int left = j + 1, right = length - 1;
                while (left < right) {
                    // 计算4个数之和
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        List<Integer> list = new ArrayList();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        quadruplets.add(list);
                        // 不可有重复值
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        // 不可有重复值
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return quadruplets;
    }
}
