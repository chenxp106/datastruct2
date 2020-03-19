package cn.gdut.leetcode.sousuo.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Subsets
 * @Desctiption 78 求子集
 * @Date 2020/3/18 20:17
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer>  temp = new ArrayList<>();
        for(int i = 0; i <= nums.length; i++){
            tracking(ret, temp, 0, nums, i);
        }
        return ret;
    }

    private void tracking(List<List<Integer>> ret, List<Integer> temp, int start, int [] nums, int size){

        if(temp.size() == size){
            ret.add(new ArrayList(temp));
            return;
        }
        for(int i = start; i < nums.length; i++){
            temp.add(nums[i]);
            tracking(ret, temp, i+1, nums, size);
            temp.remove(temp.size() -1);
        }
    }
}
