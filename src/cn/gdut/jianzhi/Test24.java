package cn.gdut.jianzhi;

/**
 * 翻转链表
 */
public class Test24 {
    public ListNode ReverserList(ListNode head){
        // 用头插法
        if (head == null ){
            return null;
        }
        // 使用头插法，新建立一个头结点
        ListNode newHead = new ListNode(-1);
        newHead.next = null;
        ListNode cur = head;
        while (cur != null){
            head = head.next;
            cur.next = newHead.next;
            newHead.next = cur;
            cur = head;
        }
        return newHead.next;
    }
}
