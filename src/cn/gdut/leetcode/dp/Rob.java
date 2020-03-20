package cn.gdut.leetcode.dp;

/**
 * @ClassName Rob
 * @Desctiption 198 打家劫舍
 * @Date 2020/3/19 9:31
 */
public class Rob {
    public int rob(int [] nums){
        int n = nums.length;
        if (n <= 0){
            return 0;
        }
        if (n == 1){
            return nums[0];
        }
        if (n == 2){
            return Math.max(nums[1], nums[0]);
        }
        int [] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], nums[0]);
        for (int i = 2; i < n; i++ ){
            dp[i] = Math.max((dp[i-2]+nums[i]), dp[i-1]);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        Rob rob = new Rob();
        int [] n = {2,1,1,2};
        System.out.println(rob.rob(n));
    }
}








