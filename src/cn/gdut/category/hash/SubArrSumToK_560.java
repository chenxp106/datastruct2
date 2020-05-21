package cn.gdut.category.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName SubArrSumToK_560
 * @Desctiption 给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。
 * @Date 2020/5/21 8:15
 */
public class SubArrSumToK_560 {
    // 暴力法，时间复杂度为O(N^2)
    public static int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                if (sum + nums[j] == k) {
                    // 可能存在{0,0,0,0} 0的情况
                    count++;
                    sum += nums[j];
                }
                // 可能存在负数，后面的也可能存在
                else {
                    sum += nums[j];
                }
            }
        }
        return count;
    }

    // 第二种解法，用Map实现。时间复杂度为O(N)
    public static int subarraySum2(int [] nums, int k){
        int sum = 0;
        int res = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            // 如果存在和为sum - k的连续式数组。
            if (preSum.containsKey(sum - k)){
                res += preSum.get(sum - k);
            }
            // 如果不存在，则将连续子数组存进presum中
            preSum.put(sum, preSum.getOrDefault(sum, 0 ) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 5, 5, 3, 2, 4};
        System.out.println(subarraySum2(arr, 10));  // 2

    }
}




















