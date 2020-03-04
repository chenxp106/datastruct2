package cn.gdut.leetcode.tanxin;

/**
 * @ClassName MaxProfit2
 * @Desctiption TODO
 * @Date 2020/3/4 9:46
 */
public class MaxProfit2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }
}
