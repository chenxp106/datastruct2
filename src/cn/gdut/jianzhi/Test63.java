package cn.gdut.jianzhi;

/**
 * @Desctiption TODO
 * @Date 2019/12/12/012
 **/
public class Test63 {
    public int maxProfit(int [] prices){
        int curMax = 0;
        if (prices == null || prices.length == 0){
            return curMax;
        }
        int min = prices[0];
        for (int i = 1; i < prices.length; i++){
            curMax = Math.max(prices[i] - min,curMax) > curMax ? prices[i] - min : curMax;
            min = Math.min(min, prices[i]);
        }
        return curMax;
    }
}
