package cn.gdut.jianzhi;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @Desctiption 获取数据流的中位数
 * @Date 2019/11/25/025
 **/
public class Test41_1 {
    /*// 建立大小根堆
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
    }*/

    // 定义大小根堆,左边是大根堆。
    PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2 - o1);
    // 右边是小根堆
    PriorityQueue<Integer> right = new PriorityQueue<>();
    // 定义总数
    int cnt = 0;

    public void Insert(Integer num){
        // 规定，当前个数为偶数时，先在left大根堆中排序。得到的结果放到小根堆中。此时个数为奇数。即右边多一个数
        if (cnt % 2 == 0){
            left.add(num);
            right.add(left.poll());
        }
        // 否则，相反的操作，这时左右两边的个数是一样的
        else {
            right.add(num);
            left.add(right.poll());
        }
        cnt++;
    }

    public Double GetMedian(){
        // 是偶数，将两个根相加 / 2
        if (cnt % 2 == 0){
            return ( left.peek() + right.peek() ) / 2.0;
        }
        else {
            return (double) right.peek();
        }
    }
}
