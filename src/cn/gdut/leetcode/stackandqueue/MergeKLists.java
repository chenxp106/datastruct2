package cn.gdut.leetcode.stackandqueue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName MergeKLists
 * @Desctiption TODO
 * @Date 2020/4/3 16:46
 */
public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists){
        // 使用小根堆
        Queue<ListNode> heap = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        ListNode newNode = new ListNode(-1);
        // 将节点放入
        for (ListNode list : lists){
            if (list == null){
                continue;
            }
            heap.add(list);
        }
        ListNode cur = newNode;
        while ( !heap.isEmpty()){
            ListNode nextNode = heap.poll();
            cur.next = nextNode;
            cur = cur.next;
            if (nextNode.next != null){
                heap.add(nextNode.next);
            }
        }
        return newNode.next;

    }
}






















