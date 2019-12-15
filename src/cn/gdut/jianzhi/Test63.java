package cn.gdut.jianzhi;

/**
 * @Desctiption TODO
 * @Date 2019/12/12/012
 **/
public class Test63 {
    public int maxProfit(int [] prices){
        if (prices == null || prices.length == 0){
            return 0;
        }
        // 定义当前最大收益
        int curMax = 0;
        // 最小的卖出
        int min = prices[0];
        for (int i = 1; i < prices.length;i++){
            curMax = Math.max(curMax, (prices[i] - min)) ;
            min = Math.min(min, prices[i]);
        }
        return curMax;
    }
}
