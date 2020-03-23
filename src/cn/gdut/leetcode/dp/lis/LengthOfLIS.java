package cn.gdut.leetcode.dp.lis;

import java.util.Arrays;

/**
 * @ClassName LengthOfLIS
 * @Desctiption TODO
 * @Date 2020/3/22 10:02
 */
public class LengthOfLIS {
    public int lengthOfLIS(int [] nums){
        // 判空
        if(nums == null || nums.length == 0){
            return 0;
        }
        int n = nums.length;
        int [] dp = new int[n];
        Arrays.fill(dp, 1);
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    // 尝试更新dp
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }
        // 遍历dp，获取最大的上升子序列
        int res = 1;
        for(int x : dp){
            res = Math.max(res, x);
        }
        return res;
    }

    public static void main(String[] args) {
        LengthOfLIS lengthOfLIS = new LengthOfLIS();
        int [] a = {-2,-1};
        System.out.println(lengthOfLIS.lengthOfLIS(a));
    }
}
