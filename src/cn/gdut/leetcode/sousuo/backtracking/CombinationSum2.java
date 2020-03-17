package cn.gdut.leetcode.sousuo.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName CombinationSum2
 * @Desctiption 40 含有相同元素的组合求和
 * @Date 2020/3/17 9:44
 */
public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int [] candidates, int target){
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        boolean [] visited = new boolean[candidates.length];
        tracking(ret, temp, 0,  candidates, target, visited);
        return ret;
    }

    private void tracking(List<List<Integer>> ret, List<Integer> temp, int start, int [] candidates, int target, boolean [] visited){

        if (target == 0){
            ret.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < candidates.length; i++){
            if (i != 0 && candidates[i-1] == candidates[i] && !visited[i-1]){
                continue;
            }

            if (candidates[i] <=  target){
                visited[i] = true;
                temp.add(candidates[i]);
                tracking(ret, temp, i+1, candidates, target - candidates[i], visited);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        CombinationSum2 combinationSum = new CombinationSum2();
        int [] a = {10,1,2,7,6,1,5};
        System.out.println(combinationSum.combinationSum2(a, 8));
    }
}
