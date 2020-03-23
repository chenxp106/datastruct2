package cn.gdut.leetcode.tree;

/**
 * @ClassName IsSymmetric
 * @Desctiption TODO
 * @Date 2020/3/23 10:44
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root){
        if (root == null){
            return true;
        }
        return isSys(root.left, root.right);
    }

    private boolean isSys(TreeNode node1, TreeNode node2){
        if (node1 == null && node2 == null){
            return true;
        }
        if (node1 == null || node2 == null){
            return false;
        }
        if (node1.val != node2.val){
            return false;
        }
        return isSys(node1.left, node2.right) && isSys(node1.right, node2.left);
    }
}
