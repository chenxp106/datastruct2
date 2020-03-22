package cn.gdut.leetcode.dp.lis;

import java.util.Arrays;

/**
 * @ClassName LengthOfLIS
 * @Desctiption TODO
 * @Date 2020/3/22 10:02
 */
public class LengthOfLIS {
    public int lengthOfLIS(int [] nums){
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int [] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++){
            for (int j = 0; j < i; j++){
                if (nums[i] > nums[j]){
                    // 尝试更新当前值
                    if (nums[i] > nums[j]){
                        dp[i] = Math.max(dp[j] + 1, dp[i]);
                    }
                }
            }
        }
        int max = 1;
        for (int x : dp){
            max = Math.max(x, max);
        }
        return max;
    }
}
