package cn.gdut.leetcode.arrayfind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName FourSum
 * @Desctiption 18 四个数之和
 * @Date 2020/4/5 11:06
 */
public class FourSum {
    public List<List<Integer>> fourSum(int [] nums, int target){
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4){
            return res;
        }
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; i++){

            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int temp = target - nums[i];
            for (int j = i+1; j < n - 2; j++ ){
                if (j > i + 1 && nums[j-1] == nums[j]){
                    continue;
                }
                int low = j + 1;
                int high = n - 1;
                int sum = nums[low] + nums[high] + nums[j];
                while (low < high){
                    if (sum > temp){
                        while (low < high && nums[high] == nums[high-1]){
                            high--;
                        }
                    }
                    else if (sum < temp){
                        while (low < high && nums[low] == nums[low+1]){
                            low++;
                        }
                    }
                    else {

                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[low]);
                        list.add(nums[high]);
                        res.add(list);
                        while (low < high && nums[low] == nums[low+1]){
                            low++;
                        }
                        while (low < high && nums[high] == nums[high - 1]){
                            high++;
                        }
                        low++;
                        high--;
                    }
                }

            }
        }
        return res;
    }
}
