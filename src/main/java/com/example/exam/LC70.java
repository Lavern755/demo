package com.example.exam;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liwen
 */
public class LC70 {
    private Map<Integer, Integer> memoMap = new HashMap<>();
    public int climbStairs(int n) {
        if (memoMap.containsKey(n)) {
            return memoMap.get(n);
        }
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return 1;
        }

        int ans = climbStairs(n - 2) + climbStairs(n - 1);
        memoMap.put(n, ans);
        return ans;
    }
}
