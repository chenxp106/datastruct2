package cn.gdut.jianzhi;

public class Test23 {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if (pHead == null || pHead.next == null){
            return null;
        }
        // 使用快慢指针
        ListNode fast = pHead;
        ListNode slow = pHead;
        do {
            fast = fast.next.next;
            slow = slow.next;
        }while (fast != slow);

        // 让快指针回到头，同时快慢指针都走一格
        fast = pHead;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
