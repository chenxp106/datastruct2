package cn.gdut.leetcode.tracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 子集
 */
public class Test78_Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        // 求排列
        for (int i = 0; i <= nums.length; i ++){
            getPailie(res, temp, 0, i, nums);
        }
        return res;
    }

    private void getPailie(List<List<Integer>> res, List<Integer> temp, int start, int count, int [] nums){
        // 递归出口
        if (temp.size() == count){
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < nums.length ;i++){
            temp.add(nums[i]);
            getPailie(res, temp, i + 1, count, nums);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Test78_Subsets test = new Test78_Subsets();
        List<List<Integer>> subsets = test.subsets(new int[]{1, 2, 3});
        System.out.println(subsets);
    }
}
