package cn.gdut.zuo.class3;

import cn.gdut.zuo.utils.RandNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desctiption 赋值有随机指针的链表
 * @Date 2019/12/25/025
 **/
public class Code13_CopyListWithRandom {

    /**
     * 第一种方法，使用一个map,存储的是当前节点的拷贝节点
     * @param head
     */
    public static RandNode copy(RandNode head){
        Map<RandNode, RandNode> map = new HashMap<>();
        RandNode cur = head;
        while (cur != null){
            // k是原来节点v是复制的节点
            map.put(cur, new RandNode(cur.val));
            cur = cur.next;
        }
        cur = head;
        // 再次遍历，找到节点
        while (cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).rand = map.get(cur.rand);
            cur = cur.next;
        }
        return map.get(head);
    }

    /**
     * 第二种方法
     * 第一次遍历，在每个节点后面新建一个节点，然后赋值
     * 第二次遍历，赋值随机指针
     * 第三次遍历，分离开来
     * @param head
     * @return
     */
    public static RandNode copy2(RandNode head){
        if (head == null){
            return null;
        }
        RandNode cur = head;
        RandNode next = null;
        while (cur != null){
            // 将新节点插入到两个节点之间
            next = cur.next;
            cur.next = new RandNode(cur.val);
            cur.next.next = next;
            cur = cur.next;
        }
        // 赋值随机指针
        cur = head;
        RandNode curCopy = null;
        while (cur != null){
            next = cur.next.next;
            curCopy = cur.next;
            curCopy.rand = cur.rand != null ? cur.rand.next : null;
            cur = next;
        }
        // 分离开来
        RandNode res = head.next;
        cur = head;
        while (cur != null){
            next = cur.next.next;
            curCopy = cur.next;
            cur.next = next;
            curCopy.next = next != null ? next.next : null;
            cur = next;
        }
        return res;

    }


    public static void printRandLinkedList(RandNode head) {
        RandNode cur = head;
        System.out.print("order: ");
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
        cur = head;
        System.out.print("rand:  ");
        while (cur != null) {
            System.out.print(cur.rand == null ? "- " : cur.rand.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        RandNode head = null;
        RandNode res1 = null;
        RandNode res2 = null;
        printRandLinkedList(head);
//        res1 = copyListWithRand1(head);
//        printRandLinkedList(res1);
//        res2 = copyListWithRand2(head);
        printRandLinkedList(res2);
        printRandLinkedList(head);
        System.out.println("=========================");

        head = new RandNode(1);
        head.next = new RandNode(2);
        head.next.next = new RandNode(3);
        head.next.next.next = new RandNode(4);
        head.next.next.next.next = new RandNode(5);
        head.next.next.next.next.next = new RandNode(6);

        head.rand = head.next.next.next.next.next; // 1 -> 6
        head.next.rand = head.next.next.next.next.next; // 2 -> 6
        head.next.next.rand = head.next.next.next.next; // 3 -> 5
        head.next.next.next.rand = head.next.next; // 4 -> 3
        head.next.next.next.next.rand = null; // 5 -> null
        head.next.next.next.next.next.rand = head.next.next.next; // 6 -> 4

//        printRandLinkedList(head);
//        res1 = copyListWithRand1(head);
//        printRandLinkedList(res1);
//        res2 = copyListWithRand2(head);
//        printRandLinkedList(res2);
//        printRandLinkedList(head);
        System.out.println("=========================");

    }

}
