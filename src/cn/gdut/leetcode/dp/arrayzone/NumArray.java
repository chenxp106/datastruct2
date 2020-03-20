package cn.gdut.leetcode.dp.arrayzone;

/**
 * @ClassName NumArray
 * @Desctiption TODO
 * @Date 2020/3/20 9:09
 */
public class NumArray {
    int [] dp ;

    public NumArray(int [] nums){
        // 找出每个位置的最大值
        dp =  new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            dp[i] = dp[i-1] + nums[i];
        }

    }

    public int sumRange(int i, int j){
        return dp[j] - dp[i];
    }

}
