package cn.gdut.leetcode.array;

import java.util.Map;

/**
 * @ClassName MinSubArrayLen
 * @Desctiption TODO
 * @Date 2020/4/8 11:37
 */
public class MinSubArrayLen {
    public int minSubArrayLen(int s, int [] nums){
        int l = 0, r = -1;
        int sum = 0;
        int res = nums.length + 1;
        while (r + 1 < nums.length && l < nums.length){
            if (sum < s){
                r++;
                sum += nums[r];
            }
            else {
                sum -= nums[l];
                l++;
            }
            if (sum >= s){
                res = Math.min(res, r -l +1);
            }
        }
        if (res == nums.length + 1){
            return 0;
        }
        return res;
    }
}















