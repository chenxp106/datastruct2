package cn.gdut.zuo.class4;

import cn.gdut.zuo.utils.TreeNode;

import java.util.Stack;

/**
 * @Desctiption TODO
 * @Date 2019/12/26/026
 **/
public class Code01_PreInPostTraversal {

    /**
     * 先序遍历
     * @param head
     */
    public static void preOrder(TreeNode head){
        if (head == null){
            return;
        }
        System.out.print(head.val+ " ");
        preOrder(head.left);
        preOrder(head.right);
    }

    /**
     * 中序遍历
     * @param head
     */
    public static void inOrder(TreeNode head){
        if (head == null){
            return;
        }
        inOrder(head.left);
        System.out.print(head.val + " ");
        inOrder(head.right);
    }


    /**
     * 后续递归
     * @param head
     */
    public static void postOrder(TreeNode head){
        if (head == null){
            return;
        }
        postOrder(head.left);
        postOrder(head.right);
        System.out.print(head.val + " ");
    }

    /**
     * 非递归实现先序遍历
     * 用栈实现，先将节点进栈，判断左右子树是否为空，不为空的话，先后将右子树和左子树进栈
     * @param head
     */
    public static void preOrdernRecur(TreeNode head){
        Stack<TreeNode> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()){
            // 先后孩子进栈，再左孩子进栈
            TreeNode node = stack.pop();
            System.out.print(node.val+ " ");
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
    }

    /**
     * 中序遍历非递归
     * 当前节点不为空时，当前节点进栈，指向左
     * 当前节点为空时，从栈中去一个元素打印，然后指向右
     * @param head
     */
    public static void inOrderUnRecur(TreeNode head){
        Stack<TreeNode> stack = new Stack<>();
        if (head != null){
            while (!stack.isEmpty() || head != null){
                if (head != null){
                    stack.push(head);
                    head = head.left;
                }
                else {
                    TreeNode node = stack.pop();
                    System.out.print(node.val + " ");
                    head = node.right;
                }
            }
        }
    }

    /**
     * 后续非递归
     * @param head
     */
    public static void postOrderUnRecur(TreeNode head){
        if (head != null){
            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();
            s1.push(head);
            while (!s1.isEmpty()){
                TreeNode node = s1.pop();
                s2.push(node);
                if (node.left != null){
                    s1.push(node.left);
                }
                if (node.right != null){
                    s1.push(node.right);
                }
            }
            while (!s2.isEmpty()){
                System.out.print(s2.pop().val + " ");
            }
        }
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(5);
        head.left = new TreeNode(3);
        head.right = new TreeNode(8);
        head.left.left = new TreeNode(2);
        head.left.right = new TreeNode(4);
        head.left.left.left = new TreeNode(1);
        head.right.left = new TreeNode(7);
        head.right.left.left = new TreeNode(6);
        head.right.right = new TreeNode(10);
        head.right.right.left = new TreeNode(9);
        head.right.right.right = new TreeNode(11);

        System.out.println("==========先序==============");
        preOrder(head);
        System.out.println();
        System.out.println("==========中序==============");
        inOrder(head);
        System.out.println();
        System.out.println("==========后续==============");
        postOrder(head);
        System.out.println();
        System.out.println("==========非递归先序==============");
        preOrdernRecur(head);
        System.out.println();
        System.out.println("==========非递归中序==============");
        inOrderUnRecur(head);
        System.out.println();
        System.out.println("==========非递归后序==============");
        postOrderUnRecur(head);
    }
}
