package cn.gdut.leetcode.dp;

/**
 * @ClassName ClimbStairs
 * @Desctiption TODO
 * @Date 2020/3/18 20:23
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        if(n < 3){
            return n;
        }

        int [] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<n+1; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
