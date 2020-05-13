package cn.gdut.jianzhi;

/**
 * @Desctiption TODO
 * @Date 2019/12/12/012
 **/
public class Test63 {
    public int maxProfit(int [] prices){
        if (prices == null || prices.length == 1){
            return 0;
        }
        int profit = 0;
        int curMin = prices[0];
        for (int i = 1; i < prices.length; i++){
            curMin = Math.min(curMin, prices[i]);
            profit = Math.max(profit, prices[i] - curMin);
        }
        return profit;
    }
}
