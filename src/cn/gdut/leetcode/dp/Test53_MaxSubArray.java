package cn.gdut.leetcode.dp;

/*
最大子序和
 */
public class Test53_MaxSubArray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n];
        // 边界条件
        dp[0] = nums[0];
        for (int i = 1; i < n; i++){
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
        }
        int max = dp[0];
        for (int x : dp){
            max = Math.max(x, max);
        }
        return max;
    }
}
