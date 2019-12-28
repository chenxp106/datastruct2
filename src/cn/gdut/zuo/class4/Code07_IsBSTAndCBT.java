package cn.gdut.zuo.class4;

import cn.gdut.zuo.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Desctiption 判断是否为平衡二叉树
 * @Date 2019/12/27/027
 **/
public class Code07_IsBSTAndCBT {

    /**
     * 判断是否为满二叉树
     * 一个节点有四种情况：1 有左右子树。2、有左没右。3、有右没左， 4、左右没有
     * 当出现有右没左，直接返回。出现有左没右或是左右都没有时，后面的都要为叶子节点才是满二叉树
     * @param head
     * @return
     */
    public static boolean isCTT(TreeNode head){
        if (head == null){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        boolean leaf = false;
        TreeNode left = null;
        TreeNode right = null;
        queue.offer(head);
        while (!queue.isEmpty()){
            head = queue.poll();
            left = head.left;
            right = head.right;
            // 开启了需要叶子节点，并且需要左右子树都为空，才能返回true
            if ( (leaf && (left != null || right != null)) || (left == null && right != null)){
                return false;
            }
            if (left != null){
                queue.offer(left);
            }
            if (right != null){
                queue.offer(right);
            }
            // 开启叶子
            if (left == null || right == null){
                leaf = true;
            }
        }
        return true;
    }

}
