package cn.gdut.jianzhi;

public class Test24 {
    public ListNode ReverserList(ListNode head){
        if (head == null){
            return null;
        }

        // 头结点
        ListNode newHead = new ListNode(-1);
        newHead.next = null;
        ListNode tmp = null;
        // 头插法
        while (head != null){
            tmp = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = tmp;
        }
        return newHead.next;
    }
}
