package cn.gdut.jianzhi;

/**
 * 翻转链表
 */
public class Test24 {
    public ListNode ReverserList(ListNode head){
        // 采用头插法
        if (head == null){
            return null;
        }
        ListNode newH = new ListNode(-1);
        while (head != null){
            ListNode temp = head;
            head = head.next;
            temp.next = newH.next;
            newH.next = temp;
        }
        return newH.next;
    }
}
