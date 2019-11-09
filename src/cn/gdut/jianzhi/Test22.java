package cn.gdut.jianzhi;

public class Test22 {
    public ListNode FindKthToTail(ListNode head, int k){
        if (head == null && k < 0){
            return null;
        }
        // 创建一个头节点
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        // 第一个指针
        ListNode p1 = newHead;
        while (p1 != null && k > 0){
            k--;
            p1 = p1.next;
        }
        // 如果到达了末尾
        if (p1 == null){
            return null;
        }
        // 第二个指针
        ListNode p2 = newHead;
        while (p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
