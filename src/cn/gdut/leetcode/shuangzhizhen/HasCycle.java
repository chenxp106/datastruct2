package cn.gdut.leetcode.shuangzhizhen;

/**
 * @ClassName HasCycle
 * @Desctiption 判断链表中是否有环
 * @Date 2020/3/3 10:11
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }

        ListNode l1 = head;
        ListNode l2 = head.next;
        while (l1 != null && l2 != null && l2.next != null){
            if (l1 == l2){
                return true;
            }
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return false;

    }
}
