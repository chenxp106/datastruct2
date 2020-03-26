package cn.gdut.leetcode.tree;

public class PathSum {
    public int pathSum(TreeNode root, int sum){
        if (root == null){
            return 0;
        }
        int res = findPath(root, sum);
        res += pathSum(root.left, sum);
        res += pathSum(root.right, sum);
        return res;
    }

    /**
     * 以root为根节点，包含该节点的路径
     * @param root
     * @param sum
     * @return
     */
    private int findPath(TreeNode root, int sum){
        if (root == null){
            return 0;
        }
        int res = 0;
        if (root.val == sum){
            res += 1;
        }
        res += findPath(root.left, sum - root.val);
        res += findPath(root.right, sum - root.val);
        return res;

    }
}













