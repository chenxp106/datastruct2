package cn.gdut.jianzhi;

import java.util.ArrayList;

/**
 * @Desctiption 和为S的连续正数序列
 * @Date 2019/12/7/007
 **/
public class Test57_2 {

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum){
        /*ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        // 初始化，从前两个数开始
        int start = 1, end = 2;
        // 当前和为3
        int curSum = 3;
        // 当最大的数比和都大的时候，就退出循环
        while (end < sum){
            // 大了，前面的往后移动
            if (curSum > sum){
                curSum -= start;
                start++;
            }
            // 小了，后面的往后移动
            else if (curSum < sum){
                end++;
                curSum += end;
            }
            // 相等，将start和中间的数加入list中
            else {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = start; i <= end; i++){
                    list.add(i);
                }
                ret.add(list);
                //窗口往后移动一格
                curSum -= start;
                start++;
                end++;
                curSum += end;
            }
        }
        return ret;*/
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int start = 1;
        int end = 2;
        int curSum = 3;
        while (start < end){
            if (curSum > sum){
                curSum -= start;
                start++;
            }
            else if (curSum < sum){
                end++;
                curSum += end;
            }
            else {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = start; i <= end; i++){
                    list.add(i);
                }
                res.add(list);
                curSum -= start;
                start++;
                end++;
                curSum += end;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        Test57_2 test57_2 = new Test57_2();
        System.out.println(test57_2.FindContinuousSequence(4));
    }
}
