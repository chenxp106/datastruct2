package cn.gdut.leetcode.dp.zore_one;

import java.util.Arrays;

/**
 * @ClassName CanPartition
 * @Desctiption TODO
 * @Date 2020/3/22 10:52
 */
public class CanPartition {

    int [][] dp ;
    public boolean canPartition(int [] nums){
        int n = nums.length;
        int sum = 0;
        for (int x : nums){
            sum += x;
        }
        if (sum %2 != 0){
            return false;
        }
        dp = new int[nums.length][sum/ 2+1];
        return  tryPart(nums, n-1, sum / 2);
    }

    private boolean tryPart(int [] nums, int i, int sum){
        if (sum == 0){
            return true;
        }
        if (i < 0 || sum < 0){
            return false;
        }
        if (dp[i][sum] != 0){
            return dp[i][sum] == 1;
        }
        dp[i][sum] = (tryPart(nums, i-1, sum) || tryPart(nums, i -1, sum - nums[i]) ) ? 1 : 0;
        return dp[i][sum] == 1;
    }
}
