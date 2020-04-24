package cn.gdut.jianzhi;

public class Test22 {
    public ListNode FindKthToTail(ListNode head, int k){
        // 如果k <= 0
        if (k <= 0){
            return null;
        }
        // 定义两个指针
        ListNode fast = head;
        ListNode slow = head;
        // 先让快指针走k个
        while (fast != null && k > 0 ){
            fast = fast.next;
            k--;
        }
        if (k > 0){
            return null;
        }
        // 再让快慢指针同时走
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
