package cn.gdut.leetcode.dp.zore_one;

/**
 * @ClassName Knapsack
 * @Desctiption TODO
 * @Date 2020/3/22 8:52
 */
public class Knapsack {
    int [][] dp ;
    public int knapsack(int W, int N, int [] weights, int [] values){
        dp = new int[N][W+1];

        return baseCase(weights, values, N - 1, W);
    }

    private int baseCase(int [] weight, int [] values, int index, int w){

        // 出口
        if (index < 0 || w <= 0 ){
            return 0;
        }
        if (dp[index][w] != 0){
            return dp[index][w];
        }
        // 不放
        int res = baseCase(weight, values, index - 1, w);
        // 如果要放,先保证能放的下
        if (weight[index] <= w ){
            res = Math.max(res, values[index] + baseCase(weight, values, index - 1, w - weight[index]));
        }
        // 记录下来
        dp[index][w] = res;
        return res;
    }

    public static void main(String[] args) {
        int [] w = {1,2,3};
        int [] v = {6,10,12};
        Knapsack knapsack = new Knapsack();
        System.out.println(knapsack.knapsack(5, 3, w,v));
    }

}




























