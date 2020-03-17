package cn.gdut.leetcode.sousuo.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CombinationSum3
 * @Desctiption 216 1-9 数字的组合求和
 * @Date 2020/3/17 9:55
 */
public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n){
        List<List<Integer>> ret = new ArrayList<>();
        if (k >= n){
            return ret;
        }
        List<Integer> temp = new ArrayList<>();
        tracking(ret, temp, 1, k, n);
        return ret;
    }

    private void tracking(List<List<Integer>> ret, List<Integer> temp, int start, int k, int n){
        if (k == 0 && n == 0){
            ret.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < 10 && k > 0; i++){
            if (i <= n){
                temp.add(i);
                tracking(ret, temp, i+1, k - 1, n - i);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        CombinationSum3 combinationSum3 = new CombinationSum3();
        System.out.println(combinationSum3.combinationSum3(3,7));
    }
}
