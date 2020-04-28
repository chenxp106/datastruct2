package cn.gdut.leetcode.newcoder;

import java.util.List;
import java.util.Scanner;

/**
 * @ClassName qiniu2
 * @Desctiption TODO
 * @Date 2020/4/28 20:04
 */
public class qiniu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());;
        for (int i = 0; i < n; i++){
            String s = sc.nextLine();
            char[] chars = s.toCharArray();

            ListNode head = new ListNode('@');
            ListNode cur = null;
            cur = head;
            for (char c : chars){
                ListNode temp = new ListNode(c);
                cur.next = temp;
                cur = temp;
            }
            int len = getLen(head.next);
            ListNode res = deleteDuplication(head.next);
            int len2 = 0;
            if (res == null){
                len2 = 0;
            }
            else {
                len2 = getLen(res.next);
            }
            while (len != len2){
                len = len2;
                res = deleteDuplication(res);
                len2 = getLen(res);
            }
            if (len == 0){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

        }
    }

    public static int getLen(ListNode cur){
        int len = 0;
        while (cur != null){
            len++;
            cur = cur.next;
        }
        return len;
    }

    public static ListNode deleteDuplication(ListNode pHead){
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        // 头结点
        ListNode newNode = new ListNode('@');
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

    public static  class  ListNode {
        char val;
        ListNode next = null;
        ListNode(char val){
            this.val = val;
        }
    }
}


