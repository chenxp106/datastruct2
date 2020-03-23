package cn.gdut.leetcode.tree;

/**
 * @ClassName InvertTree
 * @Desctiption TODO
 * @Date 2020/3/23 10:30
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        return root;
    }
}

