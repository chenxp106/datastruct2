package cn.gdut.jianzhi;

public class Test23 {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        // 判空，如果只有一个节点或没有节点，返回null
        if (pHead == null || pHead.next == null){
            return null;
        }
        // 快慢指针
        ListNode fast = pHead;
        ListNode slow = pHead;
        // 先走到相遇
        do {
            fast = fast.next.next;
            slow = slow.next;
        }while (fast != slow);
        // 然后让快指针从头开始走
        fast = pHead;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;

        }
        return slow;
    }
}
