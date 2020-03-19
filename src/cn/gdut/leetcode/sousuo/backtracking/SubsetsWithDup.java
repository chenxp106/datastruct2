package cn.gdut.leetcode.sousuo.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName SubsetsWithDup
 * @Desctiption 90 含有相同元素求子集
 * @Date 2020/3/18 20:20
 */
public class SubsetsWithDup {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        boolean [] visited = new boolean[nums.length];
        for(int i = 0 ; i <= nums.length; i++){
            tracking(ret, temp, 0, nums, i, visited);

        }
        return ret;
    }

    private void tracking(List<List<Integer>> ret, List<Integer> temp, int start, int [] nums, int size, boolean [] visited){
        if(temp.size() == size){
            ret.add(new ArrayList(temp));
        }
        for(int i = start; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i-1] && !visited[i-1]){
                continue;
            }
            temp.add( nums[i]);
            visited[i] = true;
            tracking(ret,temp, i+1, nums, size, visited);
            temp.remove(temp.size() -1);
            visited[i] = false;

        }
    }
}
