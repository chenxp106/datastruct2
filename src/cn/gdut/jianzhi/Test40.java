package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.Arrays;

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
    public ArrayList<Integer> GetLeastNumbers_solution(int [] input, int k){
        int n = input.length;
        ArrayList<Integer> res =  new ArrayList<>();
        if (input == null || n == 0){
            return res;
        }
        if (k > n || k <=0){
            return res;
        }
        // 找到k个排序好的k个数
        findK(input, 0, n-1, k-1);
        // 将前k个数输出
        for (int i = 0;i < k ;i++){
            res.add(input[i]);
        }
        return res;
    }

    private void findK(int [] input, int low, int high, int k){
        // 返回的结果表示当前的k，前半部分比k小，后半部分比k大。
        int value = partion(input, low, high);
        if (value == k){
            return;
        }
        // 在前半段找
        if (value > k ){
            findK(input, low, value-1, k);
        }
        // 在后半段找
        else {
            findK(input, value+1, high, k);
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
        int tmp = input[i];
        while (i != j){
            while ( i < j && tmp <= input[j]){
                j--;
            }
            input[i] = input[j];
            while (i < j && tmp >= input[i]){
                i++;
            }
            input[j] = input[i];
        }
        input[i] = tmp;
        return i;
    }


    public static void main(String[] args) {
        Test40 test40 = new Test40();
        int [] num = {4,5,1,6,2,7,3};
        System.out.println(test40.GetLeastNumbers_solution(num,4));
    }
}
