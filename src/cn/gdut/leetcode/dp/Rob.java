package cn.gdut.leetcode.dp;

import java.util.Map;

/**
 * @ClassName Rob
 * @Desctiption 198 打家劫舍
 * @Date 2020/3/19 9:31
 */
public class Rob {
    public int rob(int [] nums){
        int n = nums.length;
        int [] dp = new int[n];
        if (n <= 0){
            return 0;
        }
        if (n == 1){
            return nums[0];
        }
        if (n == 2){
            return Math.max(nums[0], nums[1]);
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++){
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        Rob rob = new Rob();
        int [] n = {2,1,1,2};
        System.out.println(rob.rob(n));
    }
}








