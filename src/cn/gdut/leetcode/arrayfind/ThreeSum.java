package cn.gdut.leetcode.arrayfind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ThreeSum
 * @Desctiption 15 三个数之和
 * @Date 2020/4/5 10:41
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int [] nums){
        List<List<Integer>> res = new ArrayList<>();

        if ( nums == null || nums.length < 3){
            return res;
        }
        int n = nums.length;

        Arrays.sort(nums);
        for (int i = 0; i < n; i++){
            // 如果第一个数大于0，说明没有找到。
            if (nums[i] > 0){
                return res;
            }
            // 如果存在重复元素
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            // 双指针
            int low = i + 1;
            int hight = n - 1;
            while (low < hight){
                int sum = nums[i] + nums[hight] + nums[low];
                if (sum > 0 ){
                    hight--;
                }
                else if (sum  < 0){
                    low++;
                }
                else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[hight]);
                    res.add(list);
                    // 判断左界和右界是否有重复元素，去重
                    while (low < hight && nums[low+1] == nums[low]){
                        low++;
                    }
                    while (low < hight && nums[hight - 1] == nums[hight]){
                        hight--;
                    }
                    low++;
                    hight--;
                }
            }
        }
        return res;

    }
}















