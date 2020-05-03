package cn.gdut.jianzhi;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Desctiption 最小的k个数
 * @Date 2019/11/23/023
 **/
public class Test40 {

    /**
     * 快速排序思想，找到一个数，使得它的左右右k个数。此时这k个数就是所求的
     * 如果当前位置再大于k-1，在继续找，还在左边
     * 如果当前位置小于k-1，继续找，在右边
     * @param input
     * @param k
     * @return
     */
//    public ArrayList<Integer> GetLeastNumbers_solution(int [] input, int k){
//        ArrayList<Integer> res = new ArrayList<>();
//        int len = input.length;
//        if (k > len || k < 1){
//            return res;
//        }
//        findK(input, 0, len - 1, k -1);
//        for (int i = 0; i < k; i++){
//            res.add(input[i]);
//        }
//        return res;
//
//    }
    public ArrayList<Integer> GetLeastNumbers_solution(int [] input, int k){
        ArrayList<Integer> res = new ArrayList<>();
        int len = input.length;
        if (k > len || k < 1){
            return res;
        }
        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0;i < k; i++){
            queue.add(input[i]);
        }
        while (k > 0){
            res.add(queue.poll());
            k--;
        }
        return res;
    }

    private void findK(int [] input, int low, int high, int k){

        int index = partion(input, low, high);
        if (index == k){
            return;
        }
        if (index > k){
            findK(input, low, index - 1, k);
        }
        else {
            findK(input, index + 1, high, k);
        }
    }

    /**
     * 一次快速排序
     * @param input
     * @param low
     * @param high
     * @return
     */
    private int partion(int [] input, int low, int high){
        int i = low;
        int j = high;
        int temp = input[i];
        while (i < j){
            while (i < j && temp <= input[j]){
                j--;
            }
            input[i] = input[j];
            while (i < j && temp >= input[i]){
                i++;
            }
            input[j] = input[i];
        }
        input[i] = temp;
        return i;
    }


    public static void main(String[] args) {
        Test40 test40 = new Test40();
        int [] num = {4,5,1,6,2,7,3};
        System.out.println(test40.GetLeastNumbers_solution(num,4));
    }
}
