package cn.gdut.zuo.jinjie.class1;

import java.util.LinkedList;

/**
 * @ClassName AllLessSubArray
 * @Desctiption 求一个数组中，所有子序列的个数，其中这个子序列中最大值减去最小值的差小于等于num
 * @Date 2020/5/18 8:49
 */
public class AllLessSubArray {

    /**
     * 维护两个双端队列
     * [L...R]如果里面的区间符合，那么缩小区间一定符合结果
     * 如图多一个就不符合的话，那么增大区间的都不符合。
     *
     * @param arr
     * @param num
     * @return
     */
    public static int getNum(int [] arr, int num){
        if (arr == null || arr.length == 0){
            return 0;
        }
        LinkedList<Integer> qmin = new LinkedList<>();
        LinkedList<Integer> qmax = new LinkedList<>();
        int L = 0;
        int R = 0;
        int res = 0;
        while (L < arr.length){
            // R 往右扩，扩到不符合的情况，停止前进。将L到R中的个数加入，即都符合
            while (R < arr.length){
                // 维护两个队列
                while (!qmin.isEmpty() && arr[qmin.peekLast()] >= arr[R]){
                    qmin.pollLast();
                }
                qmin.addLast(R);
                while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[R]){
                    qmax.pollLast();
                }
                qmax.addLast(R);
                if (arr[qmax.getFirst()] - arr[qmin.getFirst()] > num){
                    break;
                }
                R++;
            }
            // 判断下标是否过期
            if (qmin.peekFirst() == L){
                qmin.pollFirst();
            }
            if (qmax.peekFirst() == L){
                qmax.pollFirst();
            }
            // 将区间内的个数加上
            res += R - L;
            // 左边界右移一个
            L++;
        }
        return res;
    }

    public static void main(String[] args) {
        int [] a = {3,1,2,4,6,3};
        System.out.println(getNum(a, 1));
    }

    /**
     * 暴力法，列出所有的子序列，然后去判断每个子序列是否符合。时间复杂度O(n3)
     * @param arr
     * @param num
     * @return
     */
    public static int getNum1(int [] arr, int num){
        int res = 0;
        // 列出所有的子序列
        for (int start = 0; start < arr.length; start++){
            for (int end = start; end < arr.length; end++){
                if (isValed(arr, start, end, num)){
                    res++;
                }
            }
        }
        return res;
    }
    private static boolean isValed(int [] arr, int start, int end, int num){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++){
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        return max - min <= num;
    }
}
