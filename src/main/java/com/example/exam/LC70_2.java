package com.example.exam;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liwen
 */
public class LC70_2 {
    private Map<Integer, Integer> memoMap = new HashMap();
    public int climbStairs(int n) {
        if (memoMap.containsKey(n)) {
            return memoMap.get(n);
        }

        if (n == 1){
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        for (int i = 3; i <= n; i++) {
            int ans = climbStairs(i - 1) + climbStairs(i - 2);
            memoMap.put(i, ans);
        }

        return memoMap.get(n);
    }
}
