package cn.gdut.zuo.class3;

import cn.gdut.zuo.utils.Node;

/**
 * @Desctiption 给定两个链表，不知是否有环
 * 1、判断是否有环
 * 2、有环的话，找到一个相交的节点
 * @Date 2019/12/25/025
 **/
public class Code14_FindFirstInterSectNode {

    /**
     * 得到第一个公共节点
     * 单链表的情况
     * 设定快慢指针
     * 如果快指针走到最后，说明没有换，
     * 否者走到相邻的节点后，快指针从头开始走，走到两个公共节点时，即是第一个公共节点
     * @param head
     * @return
     */
    public static Node getLoopNode(Node head){
        if (head == null || head.next == null || head.next.next == null){
            return null;
        }
        Node fast = head.next.next;
        Node slow = head.next;
        while (fast != slow){
            if (slow.next == null || fast.next.next == null){
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        // 快指针从头出发，并且只走一步
        fast = head;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }


    /**
     * 获取两个链表的公共节点
     * if
     * @param head1
     * @param head2
     * @return
     */
    public static Node getInterserctNode(Node head1, Node head2){
        if (head1 == null || head1 == null){
            return null;
        }
        Node loop1 = getLoopNode(head1);
        Node loop2 = getLoopNode(head2);
        if (loop1 == null && loop2 == null){
            return noLoop(head1, head2);
        }
        // 如果两个都有环，三种情况
        if (loop1 != null && loop2 != null){

        }

        return null;
    }

    /**
     * 两个都有环的情况，传入的参数为两个头节点和两个公共节点
     *
     * @param head1
     * @param head2
     * @param loop1
     * @param loop2
     * @return
     */
    public static Node bothLoop(Node head1, Node head2, Node loop1, Node loop2){

        Node cur1 = null;
        Node cur2 = null;
        // 地址一样
        if (loop1 == loop2){
            return noLoop(head1, head2);
        }
        /*
        // 66的情况是head往后走，没有遇到loop2，说明是66
        能遇到loop2的话说明是下面这种
        \     /
         \   /
          ---
        |      |
          ---
         */
        else {
            cur1 = loop1.next;
            while (cur1 != loop1){
                if (cur1 == loop2){
                    return loop1;
                }
                cur1 = cur1.next;
            }
            return null;
        }
    }

    /**
     * 获取两个无环的公共节点
     * 1->2->3->4
     * 8->3->4
     * 分别遍历两个链表，得到长度和最后的节点
     * 判断最后的 节点是否为同一个节点，是的话有公共节点。不是的话则为没有公共节点
     * 找公共节点：长度相减，得到差值n。然后长链表先走n步，在两个一起走，走到一起说明为公共节点
     * @param head1
     * @param head2
     * @return
     */
    public static Node noLoop(Node head1, Node head2){
        if (head1 == null || head2 == null){
            return null;
        }
        Node cur1 = head1;
        Node cur2 = head2;
        int len1 = 0;
        int len2 = 0;
        while (cur1 != null ){
            cur1 = cur1.next;
            len1++;
        }
        while (cur2 != null ){
            cur2 = cur2.next;
            len2++;
        }
        if (cur1 != cur2){
            return null;
        }
        int n = Math.abs(len1 - len2);
        // 找到长的链表，头为cur1，短的为cur2
        cur1 = len1 - len2 > 0 ? head1 : head2;
        cur2 = cur1 == head1 ? head2 : head1;
        // cur1 先走n步
        while (n != 0){
            cur1 = cur1.next;
            n--;
        }
        // 从两头分别往后走,
        while (cur1 != cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }

    public static void main(String[] args) {
        Node head1;
        // 1->2->3->4->5->6->7->4...
        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
//        head1.next.next.next.next.next.next = head1.next.next.next; // 7->4

        // 0->9->8->6->7->null
        Node head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next.next.next.next.next; // 8->6

//        System.out.println(getLoopNode(head1).val);

        System.out.println(noLoop(head1,head2).val);
    }
}
