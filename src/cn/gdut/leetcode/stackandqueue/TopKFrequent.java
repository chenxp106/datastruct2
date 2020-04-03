package cn.gdut.leetcode.stackandqueue;

import java.util.*;

/**
 * @ClassName TopKFrequent
 * @Desctiption top_k问题。使用优先级队列。用map存储键值对，然后遍历map。用优先级队列。
 * @Date 2020/4/3 16:18
 */
public class TopKFrequent {
    public List<Integer> topKFrequent(int [] nums, int k){
        // 新建一个map，用于存储频率和数字
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // 创建优先级队列,默认是小跟堆
        Queue<Integer> heap = new PriorityQueue<>(((o1, o2) -> map.get(o1) - map.get(o2)));
        // 遍历map
        for (int n : map.keySet()){
            heap.add(n);
            // 如果个数大于n,需要出一个元素。即维护大小为k的堆
            if (heap.size() > k){
                heap.poll();
            }
        }
        // 遍历堆
        List<Integer> top_K =  new LinkedList<>();
        while (!heap.isEmpty()){
            top_K.add(heap.poll());
        }
        Collections.reverse(top_K);
        return top_K;
    }
}


















