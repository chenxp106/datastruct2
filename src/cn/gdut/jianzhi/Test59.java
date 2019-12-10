package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Desctiption 滑动窗口的最大值
 * @Date 2019/12/10/010
 **/
public class Test59 {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> ret = new ArrayList<>();
        if (num == null || num.length == 0 || size <= 0 || size > num.length){
            return ret;
        }
        //建立大根堆
        Queue<Integer> heap =new  PriorityQueue<Integer>((o1, o2) -> o2 - o1);
        // 将前面三个数放到堆中
        for (int i = 0 ;i < size;i++){
            heap.add(num[i]);
        }
        // 将第一个结果放到ret中
        ret.add(heap.peek());
        int n = num.length;
        // 后面的数维护好大根堆
        for (int i = size, j = 0; i < n; i++ ,j++){
            heap.remove(num[j]);
            heap.add(num[i]);
            ret.add(heap.peek());
        }
        return ret;
    }
}
