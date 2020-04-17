package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test6 {
    /*public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> res = new ArrayList<>();
        // 定义一个头结点点。用于头插法
        ListNode head = new ListNode(-1);
        ListNode cur = listNode;
        while (cur != null){
            listNode = listNode.next;
            cur.next = head.next;
            head.next = cur;
            cur = listNode;
        }
        // 输出节点的值
        while (head.next != null){
            res.add(head.next.val);
            head = head.next;
        }
        return res;
    }*/

    /**
     * 用递归实现
     * @param listNode
     * @return
     */
    /*public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null){
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }*/

    /**
     * 使用栈
     * @param listNode
     * @return
     */
//     public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
//         Stack<Integer> stack = new Stack<>();
//         while (listNode != null){
//             ListNode tmp = listNode;
//             listNode = listNode.next;
//             stack.push(tmp.val);
//         }
//         ArrayList<Integer> res = new ArrayList<>();
//         while (!stack.isEmpty()){
//             res.add(stack.pop());
//         }
//         return res;
//    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        // 使用栈
        Stack<Integer> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }
}
