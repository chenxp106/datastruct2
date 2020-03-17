package cn.gdut.leetcode.sousuo.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CombinationSum
 * @Desctiption 39 组合求和
 * @Date 2020/3/17 9:21
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int [] candidates, int target){
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        tracking(ret, temp, 0,  candidates, target);
        return ret;
    }

    private void tracking(List<List<Integer>> ret, List<Integer> temp, int start, int [] candidates, int target){

        if (target == 0){
            ret.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < candidates.length; i++){

            if (candidates[i] <=  target){
                temp.add(candidates[i]);
                tracking(ret, temp, i, candidates, target - candidates[i]);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        int [] a = {2,3,6,7};
        System.out.println(combinationSum.combinationSum(a, 7));
    }
}
