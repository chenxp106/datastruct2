package cn.gdut.jianzhi;

import java.util.Map;

/**
 * @Desctiption TODO
 * @Date 2019/12/12/012
 **/
public class Test63 {
    public int maxProfit(int [] prices){
        /*if (prices == null || prices.length == 1){
            return 0;
        }
        int profit = 0;
        int curMin = prices[0];
        for (int i = 1; i < prices.length; i++){
            curMin = Math.min(curMin, prices[i]);
            profit = Math.max(profit, prices[i] - curMin);
        }
        return profit;*/


        // 先判空
        if (prices == null || prices.length == 0){
            return 0;
        }
        int maxAmont = 0;
        int min = prices[0];
        for (int x : prices){
            // 每次选择最小的数
            if (x < min){
                min = x;
            }
            // 计算当前的利润
            int curAmont = x - min;
            // 选择较大的利润
            maxAmont = Math.max(curAmont, maxAmont);
        }
        return maxAmont;
    }
}
