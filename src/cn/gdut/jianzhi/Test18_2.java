package cn.gdut.jianzhi;

public class Test18_2 {
    public ListNode deleteDuplication(ListNode pHead){
/*        if (pHead == null || pHead.next == null){
            return pHead;
        }
        //定义头节点，pre，cur，next节点
        ListNode newH = new ListNode(-1);
        newH.next = pHead;
        ListNode pre = newH;
        ListNode cur = pre.next;
        ListNode next = cur.next;
        while (next != null){
            // 1 2 3 4,指针后移
            if (cur.val != next.val){
                pre = cur;
                cur = next;
                next = next.next;
            }
            else {
                //1112
                while (next != null && cur.val == next.val){
                    next = next.next;
                }
                cur = next;
                pre.next = next;
                if (next != null){
                    next = next.next;
                }
            }
        }
        return newH.next;*/
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        // 头结点
        ListNode newNode = new ListNode(-1);
        newNode.next = pHead;
        ListNode cur = newNode.next;
        ListNode nextNode = cur.next;
        ListNode pre = newNode;
        while (nextNode != null){
            if (cur.val != nextNode.val){
                pre = cur;
                cur = nextNode;
                nextNode = nextNode.next;
            }
            else {
                while (nextNode != null && cur.val == nextNode.val){
                    nextNode = nextNode.next;
                }
                cur = nextNode;
                pre.next = nextNode;

                if (nextNode != null){
                    nextNode = nextNode.next;
                }
            }
        }
        return newNode.next;
    }

}
