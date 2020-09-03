package cn.gdut.leetcode.dp;

import java.util.Arrays;

/**
 * 零钱兑换
 */
public class Test322_CoinChange {

    public static int coinChange(int[] coins, int amount) {
        // 初始化数组dp为金额的总和
        int [] dp = new int[amount+1];
        int max = amount + 1;
        Arrays.fill(dp, max);
        dp[0] = 0;

        // 循环金额
        for (int i = 1; i <= amount; i++){
            // 循环面额
            for (int j = 0; j < coins.length; j++){

                // 钱够多的时候
                if (i >= coins[j] ){
                    // 更新dp。不取，和取
                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                }
            }
        }
        return dp[amount] >= max ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1,2,5}, 11));
    }
}
