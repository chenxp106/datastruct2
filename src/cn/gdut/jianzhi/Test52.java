package cn.gdut.jianzhi;

/**
 * @Desctiption 两个链表的第一个公共节点
 * 交替
 * @Date 2019/12/4/004
 **/
public class Test52 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2){
        /*ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != p2){
            p1 = (p1 == null ) ? pHead2 : p1.next;
            p2 = (p2 == null ) ? pHead1 : p2.next;
        }
        return p1;*/
        /**
         * 寻找公共节点
         * 一直遍历，当两节点为同一节点时既是。
         * 当其中一个为尾节点时，将它置为另一个节点。循环
         */
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != p2){
            if (p1 == null){
                p1 = pHead2;
            }
            else {
                p1 = p1.next;
            }
            if (p2 == null){
                p2 = pHead1;
            }
            else {
                p2 = p2.next;
            }
        }
        return p1;
    }
}
