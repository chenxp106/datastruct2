package cn.gdut.leetcode.array;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName zhongweishu
 * @Desctiption TODO
 * @Date 2020/4/7 21:00
 */
public class zhongweishu {
    public int getZhongweishu(ListNode h1, ListNode h2){
        Queue<ListNode> smallHeap = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        Queue<ListNode> bigHeap = new PriorityQueue<>((o1, o2) -> o2.val - o1.val);
        int cnt = 0;
        while (h1.next != null){
            ListNode temp = h1.next;
            smallHeap.add(temp);
            cnt++;
        }
        return 0;
    }
}
