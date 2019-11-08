package cn.gdut.jianzhi;

public class Test22 {
    public ListNode FindKthToTail(ListNode head, int k){
        if (head == null || k < 0){
            return null;
        }
        // 定义第一个指针
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode p1 = newHead;
        while (p1 != null && k > 0){
            p1 = p1.next;
            k--;
        }
        //如果k大于长度。直接返回null
        if (p1 == null){
            return null;
        }
        // 定义第二个指针
        ListNode p2 = newHead;
        while (p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
