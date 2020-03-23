package cn.gdut.leetcode.tree;

/**
 * @ClassName HasPathSum
 * @Desctiption 路径总和
 * @Date 2020/3/23 11:07
 */
public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum){
        if (root.left == null && root.right == null){
            return sum == 0;
        }
        if (hasPathSum(root.left, sum - root.val)){
            return true;
        }
        if (hasPathSum(root.right, sum - root.val)){
            return true;
        }
        return false;
    }
}
