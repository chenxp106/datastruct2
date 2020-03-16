package cn.gdut.leetcode.sousuo.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Permute2
 * @Desctiption 含有相同元素的全排列
 * @Date 2020/3/16 10:01
 */
public class Permute2 {
    public List<List<Integer>> permuteUnique(int [] nums){
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        // 要先排序
        Arrays.sort(nums);
        boolean [] visited = new boolean[nums.length];
        tracking(ret, temp, nums, visited);
        return ret;
    }

    private void tracking(List<List<Integer>> ret, List<Integer> temp, int [] nums, boolean [] visited){
        if (temp.size() == nums.length){
            ret.add(new ArrayList<>(temp));
            return;
        }
        // 遍历
        for (int i = 0; i < nums.length; i++){
            // 防止重复
            if (i != 0 && nums[i-1] == nums[i] && !visited[i-1]){
                continue;
            }
            if (visited[i] ){
                continue;
            }
            // 访问

            visited[i] = true;
            temp.add(nums[i]);
            tracking(ret, temp, nums, visited);
            // 移除并设置未方位
            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        Permute2 permute2 = new Permute2();
        int [] nums = {3, 0, 3,3};
        System.out.println(permute2.permuteUnique(nums));

    }
}





















