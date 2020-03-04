package cn.gdut.leetcode.tanxin;

/**
 * @ClassName MaxProfit
 * @Desctiption // 121 买股票的最大时机，只能一次买卖
 * @Date 2020/3/4 9:31
 */
public class MaxProfit {

    public int maxProfit(int [] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 初始最大
        int preMin = nums[0];
        int maxPro = 0;
        for (int i = 1; i <= nums.length -1 ; i++){
            // 当前的比现在小，则选择当前的为最小
            maxPro = Math.max( maxPro, nums[i] - preMin);
            preMin = nums[i] < preMin ? nums[i] : preMin;

        }
        return maxPro;
    }

    public static void main(String[] args) {
        int [] nums = {1,2};
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxProfit(nums));
    }
}
