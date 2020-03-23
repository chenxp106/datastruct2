package cn.gdut.leetcode.tree;

/**
 * @ClassName MaxDepth
 * @Desctiption TODO
 * @Date 2020/3/23 10:18
 */
public class MaxDepth {
    public int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
