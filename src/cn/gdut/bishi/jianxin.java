package cn.gdut.bishi;

import java.util.Arrays;

/**
 * 零钱兑换
 */
public class jianxin {
    private int get(int [] cars, int num){
        int [] dp = new int[num+1];
        int max = num + 1;
        Arrays.fill(dp, max);
        dp[0] = 0;

        for (int i = 1; i <= num; i++){
            for (int j = 0; j < cars.length; j++){

                if (i >= cars[j] ){
                    dp[i] = Math.min(dp[i - cars[j]] + 1, dp[i]);
                }
            }
        }
        return dp[num] >= max ? -1 : dp[num];
    }

}
