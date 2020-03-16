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

        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean [] visited = new boolean[nums.length];
        tracking(ret, nums, temp, visited);
        return ret;

    }

    private void tracking(List<List<Integer>> ret, int [] nums, List<Integer> temp, boolean [] visited){
        // 如果长度相等，就添加上。并且新建temp数组。然后返回
        if (temp.size() == nums.length){
            ret.add(new ArrayList<>(temp));
            return;
        }
        // 否则，继续遍历
        for (int i = 0; i < nums.length; i++){
            if (visited[i]){
                continue;
            }
            visited[i] = true;
            temp.add(nums[i]);
            tracking(ret, nums, temp, visited);
            // 移除一个，并设置未访问
            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }
}















