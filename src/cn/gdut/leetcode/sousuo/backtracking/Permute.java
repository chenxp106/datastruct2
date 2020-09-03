package cn.gdut.leetcode.sousuo.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Permute
 * @Desctiption 全排列
 * @Date 2020/3/16 9:13
 */
public class Permute {
    public List<List<Integer>> permute(int [] nums){
        // 全排列
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int n = nums.length;
        boolean [] visited = new boolean[n];
        tracking(res, temp, nums, visited);
        return res;

    }

    private void tracking(List<List<Integer>> res, List<Integer> temp, int [] nums, boolean [] visited){
        // 长度相等，讲temp加入到res中
         if (temp.size() == nums.length){
             res.add(new ArrayList<>(temp));
             return;
         }
         // 遍历nums
        for (int i = 0; i < nums.length; i++){
            // 如果没有访问。加入temp中，同事标记访问
            if ( !visited[i] ){
                temp.add(nums[i]);
                visited[i] = true;
                tracking(res, temp, nums, visited);
                // 将最后一个删除，同时标记未访问
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}















