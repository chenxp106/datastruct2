package cn.gdut.jianzhi;

/**
 * 合并两个有序的单链表
 */
public class Test25 {
    public ListNode Merge(ListNode list1, ListNode list2){
        // 新建一个头节点
        ListNode newHead = new ListNode(-1);
        // 如果都为空
        if (list1 == null && list2 == null){
            return null;
        }
        // 其中一个为空,直接返回另一个
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        // 否则，一个一个加入到里面
        ListNode cur = newHead;
        ListNode tmp = null;

        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                tmp = list1;
                list1 = list1.next;
            }
            else {
                tmp = list2;
                list2 = list2.next;
            }
            cur.next = tmp;
            tmp.next = null;
            cur = tmp;
        }
        if (list1 == null){
            cur.next = list2;
        }
        if (list2 == null){
            cur.next = list1;
        }
        return newHead.next;
    }
}
