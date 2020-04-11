package cn.gdut.leetcode.tracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Permute
 * @Desctiption 46 全排列
 * @Date 2020/4/10 10:23
 */
public class Permute {
    public List<List<Integer>> permute(int [] nums){
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0){
            return res;
        }
        List<Integer> temp = new ArrayList<>();
        boolean [] visited = new boolean[nums.length];
        tracking(temp, res, visited, nums);
        return res;
    }

    // 回溯，每次王temp中加入一个元素
    private void tracking(List<Integer> temp, List<List<Integer>> res, boolean [] visited, int [] nums)
    {
        if (temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        // 否则，循环数组中的所有元素
        for (int i = 0; i < nums.length; i++){
            if (!visited[i]){
                // 标记访问
                visited[i] = true;
                temp.add(nums[i]);
                tracking(temp, res, visited, nums);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}






















