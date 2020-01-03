package cn.gdut.zuo.class7;

import java.util.PriorityQueue;

/**
 * @Desctiption 哈弗曼编码
 * @Date 2020/1/3/003
 **/
public class Code02_LessMoney {
    /**
     * 给定一个数组，就他们的和最小
     * [3,1,6,3,4]
     * 实质就是哈弗曼编码，
     * 思路，将这些数放入到小根堆中，每次取出最小的两个数，相加的结果放回到小根堆中。直到小根堆中只有一个数时结束。
     * @param arr
     * @return
     */
    public static int lessMoney(int[] arr){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++){
            heap.add(arr[i]);
        }
        int sum = 0;
        int cur = 0;
        while (heap.size() > 1){
            cur = heap.poll() + heap.poll();
            sum += cur;
            heap.add(cur);
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,5};
        System.out.println(lessMoney(arr));
    }
}
