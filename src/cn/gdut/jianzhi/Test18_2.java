package cn.gdut.jianzhi;

public class Test18_2 {
    public ListNode deleteDuplication(ListNode pHead){
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode newHead = new ListNode(-1);
        newHead.next = pHead;
        ListNode pre = newHead;
        ListNode cur = pre.next;
        ListNode next = cur.next;
        while (next != null){
            // 如果当前值与下一个值不相等时 0,1,2,3,指针往后移动
            if (cur.val != next.val){
                pre = cur;
                cur = next;
                next = next.next;
            }
            // 否则相等1,1，1，2
            else {
                // 循环遍历
                while (cur.val == next.val){
                    next = next.next;
                    // 如果最后一个为空，直接跳出
                    if (next == null){
                        break;
                    }
                }
                // 删除重复节点
                pre.next = next;
                if (next != null){
                    // 重新赋值cur和next
                    cur = next;
                    next = next.next;
                }

            }
        }
        // 当出现 1 1 1
        if (newHead.next == null){
            return null;
        }
        return newHead.next;

    }
}
