package cn.gdut.leetcode.sousuo.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Combine
 * @Desctiption 组合
 * @Date 2020/3/16 10:53
 */
public class Combine {
    public List<List<Integer>> combine(int n, int k){
        /*List<List<Integer>> ret = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        tracking(ret, temp, 1, k, n);
        return ret;*/
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        tracking(res, temp, 1, k, n);
        return res;
    }

    /**
     * 从start开始，选择k个数
     * @param res
     * @param temp
     * @param start
     * @param k
     * @param n
     */
    private void tracking(List<List<Integer>> res, List<Integer> temp, int start, int k, int n){
        if (k== 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i <= n - k + 1; i++){
            temp.add(i);
            tracking(res, temp, i+1, k-1, n);
            temp.remove(temp.size() - 1);
        }
    }

















    /*private void tracking(List<List<Integer>> ret, List<Integer> temp, int start, int k, int n){
        if (k == 0){
            ret.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i <= n - k + 1; i++){
            temp.add(i);
            // 访问
            tracking(ret, temp, i+1, k-1,n);
            // 删除一个
            temp.remove(temp.size() - 1);

        }
    }*/

    public static void main(String[] args) {
        Combine combine = new Combine();
        System.out.println(combine.combine(4,2));
    }

}

















