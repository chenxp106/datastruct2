package cn.gdut.leetcode.tree;

/**
 * @ClassName LowestCommonAncestor
 * @Desctiption TODO
 * @Date 2020/3/26 23:04
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root == null){
            return null;
        }
        if (p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        if (p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}














