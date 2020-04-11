package cn.gdut.leetcode.tracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Combine
 * @Desctiption TODO
 * @Date 2020/4/11 9:55
 */
public class Combine {
    public List<List<Integer>> combine(int n, int k){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if (n <= 0 ||  k <= 0){
            return res;
        }

        tracking(res, temp,1, n, k);
        return res;
    }

    /**
     * 从start开始添加一个元素到temp中
     * @param res
     * @param temp
     * @param start
     * @param n
     * @param k
     */
    private void tracking(List<List<Integer>> res, List<Integer> temp, int start, int n, int k){
        if (temp.size() == k){
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= n - (k - temp.size()) + 1; i++){
            temp.add(i);
            tracking(res, temp, i+1, n, k);
            temp.remove(temp.size() - 1);
        }
    }
}



























