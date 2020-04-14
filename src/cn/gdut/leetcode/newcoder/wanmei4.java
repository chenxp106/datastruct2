package cn.gdut.leetcode.newcoder;

import java.util.Scanner;

/**
 * @ClassName wanmei4
 * @Desctiption TODO
 *  * 4
 *  * 15
 *  * 5 3 4 6
 *  * 20 10 12 30
 * @Date 2020/4/14 19:34
 */
public class wanmei4 {
    private static  int [][]  dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine().trim());
        int capacity = Integer.parseInt(sc.nextLine().trim());
        String [] weightsStr = sc.nextLine().split(" ");
        int [] weights = new int[weightsStr.length];
        for (int i = 0; i < weightsStr.length; i++){
            weights[i] = Integer.parseInt(weightsStr[i].trim());
        }
        String [] valuesStr = sc.nextLine().split(" ");
        int [] vaules = new int[valuesStr.length];
        for (int i = 0; i < vaules.length; i++){
            weights[i] = Integer.parseInt(valuesStr[i].trim());
        }
        dp = new int[count][capacity+1];
        System.out.println(method(weights, vaules, count-1, capacity));

    }

    public static int method(int [] weight, int [] values, int index, int w ){
        // 出口
        if (index < 0 || w <= 0 ){
            return 0;
        }
        if (dp[index][w] != 0){
            return dp[index][w];
        }
        // 不放
        int res = method(weight, values, index - 1, w);
        // 如果要放,先保证能放的下
        if (weight[index] <= w ){
            res = Math.max(res, values[index] + method(weight, values, index - 1, w - weight[index]));
        }
        // 记录下来
        dp[index][w] = res;
        return res;
    }
}
