package cn.gdut.zuo.class4;

import cn.gdut.zuo.utils.TreeNode;

/**
 * @Desctiption 计算完全二叉树的个数
 * @Date 2019/12/28/028
 **/
public class Code08_ComputeTreeNodeNumber {

    /**
     * 计算所有节点个数
     * @param head
     * @return
     */
    public static int nodeNum(TreeNode head){
        if (head == null){
            return 0;
        }
        return bs(head, 1, mostLeftLeavel(head, 1));
    }

    /**
     * 计算节点node的所有个数
     * @param node
     * @param l
     * @param h
     * @return
     */
    public static int bs(TreeNode node, int l, int h){
        // 第一层，直接返回1
        if (l == h){
            return 1;
        }
        //
        if (mostLeftLeavel(node.right, l + 1) == h){
            return (1 << (h-1)) + bs(node.left, 1 + l, h);
        }
        else {
            return (1 << (h - 1- l)) + bs(node.left ,1+l,h);
        }
    }
    public static int mostLeftLeavel(TreeNode node, int level){
        while (node != null){
            level++;
            node = node.left;
        }
        return level - 1;
    }
}
