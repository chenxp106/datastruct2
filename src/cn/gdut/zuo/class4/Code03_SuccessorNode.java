package cn.gdut.zuo.class4;

import cn.gdut.zuo.utils.TreeNode;

/**
 * @Desctiption 中序遍历中的下一个节点
 * @Date 2019/12/26/026
 **/
public class Code03_SuccessorNode {

    public static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;
        public TreeNode parent;

        public TreeNode(int data) {
            this.value = data;
        }
    }

    /**
     * 获取下一个节点
     * 如果有右子树，下一个节点为右边的最左子树
     * 没有右子树，根据parent节点，往上找，找到x为p的左子树时停止
     * @param node
     * @return
     */
    public static TreeNode getSuccess(TreeNode node){
        if (node == null){
            return null;
        }
        if (node.right != null){
            return getLeftMost(node.right);
        }
        // 没有右子树
        else {
            TreeNode parent = node.parent;
            while (parent != null && parent.left != node){
                node = parent;
                parent = node.parent;
            }
            return parent;
        }

    }

    public static TreeNode getLeftMost(TreeNode node){
        if (node == null){
            return null;
        }
        while (node.left != null){
            node = node.left;
        }
        return node;
    }
}








