package cn.gdut.zuo.class3;

import cn.gdut.zuo.utils.Node;

import java.util.Stack;

/**
 * @Desctiption 判断一个链表是否回文
 * @Date 2019/12/24/024
 **/
public class Code11_IsPalindromeList {

    /**
     * 需要空间复杂度为O(n),用栈实现
     * @param head
     * @return
     */
    public static boolean isPalindrome(Node head){
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        cur = head;
        while (cur != null){
            if (cur.val != stack.pop().val){
                return false;
            }
            cur = cur.next;
        }
        return true;
    }

    /**
     * 需要O(n/2)的空间
     * 使用快慢指针，走一半
     * 将后半段进栈，比较栈中的元素与前半段是否相等
     */
    public static boolean isPalindrome2(Node head){
        return false;
    }

    /**
     * 不用辅助空间，
     * 1、快慢指针走到中间，后半部分该边指向
     * 2、分别从两边向中间遍历，
     * 3、将链表指向改回原来的指向
     * @param head
     * @return
     */
    public static boolean isPalindrome3(Node head){
        // 为空或是只有一个节点的时候，直接返回true
        if (head == null || head.next == null){
            return true;
        }
        // 找到中间节点
        Node n1 = head;
        Node n2 = head;
        while (n1.next != null && n2.next.next != null){
            // n1为中间节点
            n1 = n1.next;
            n2 = n2.next.next;
        }
        // n2为右半部分的第一个节点
        n2 = n1.next;
        n1.next = null;
        Node n3 = null;
        // 将后半部分指向反指
        // 1->2->3<-2<-1
        while (n2 != null){
            // 先保存下一个节点
            n3 = n2.next;
            n2.next = n1;
            n1 = n2;
            n2 = n3;
        }
        // 判断是否相等
        // 此时n1 为最后一个节点，保存下来，n2 为null。最后面
        boolean res = true;
        n3 = n1;
        n2 = head;
        while (n1 != null && n2 != null){
            if (n1.val != n2.val){
                // 在这里不能直接返回。在后面还需要翻转剩余的节点
                res = false;
                break;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        // 将后面的翻转回来
        n1 = n3.next;
        n3.next = null;
        while (n1 != null){
            n2 = n1.next;
            n1.next = n3;
            n3 = n1;
            n1 = n2;
        }
        return res;
    }
}
