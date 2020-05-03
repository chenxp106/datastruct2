package cn.gdut.jianzhi;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Desctiption 获取数据流的中位数
 * @Date 2019/11/25/025
 **/
public class Test41_1 {
    // 建立大小根堆
    // 左边是大堆,默认是小堆，因此需要加一个比较器
    private PriorityQueue<Integer> left = new PriorityQueue<>(((o1, o2) -> o2 - o1));
    // 右边是大根堆
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    // 总个数
    private int N = 0;
    public void Insert(Integer num){
        //插入元素是。如果是偶数，先进入大根堆，搜选一个将最大的数送到大根堆中
        if (N % 2 == 0){
            right.add(num);
            // 大堆出一个数,将出来的数送到小堆中
            left.add(right.poll());
        }
        // 如果是奇数，则先进小堆，再送到大堆中
        else {
            left.add(num);
            right.add(left.poll());
        }
        N++;
    }

    public Double GetMedian(){
        // 这是左边边的小堆数目多一个。偶数则为两个堆顶点的值。奇数就去小堆顶点的值
        if (N % 2 == 1){
            return (double) left.peek();
        }
        else {
            return (right.peek() + left.peek()) / 2.0;
        }
    }

}
