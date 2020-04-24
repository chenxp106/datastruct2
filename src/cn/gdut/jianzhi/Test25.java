package cn.gdut.jianzhi;

/**
 * 合并两个有序的单链表
 */
public class Test25 {
    public ListNode Merge(ListNode list1, ListNode list2){
        if (list1 == null && list2 == null){
            return null;
        }
        // 创建一个头结点
        ListNode newH = new ListNode(-1);
        ListNode pre = newH;
        ListNode temp;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                temp = list1;
                list1 = list1.next;

            }
            else {
                temp = list2;
                list2 = list2.next;

            }
            pre.next = temp;
            pre = temp;
        }

        while (list1 != null){
            // 将list1接上
            pre.next = list1;
        }
        while (list2 != null){
            pre.next = list2;
        }
        return newH.next;
    }
}
