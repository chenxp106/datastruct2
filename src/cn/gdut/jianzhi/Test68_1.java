package cn.gdut.jianzhi;

/**
 * @Desctiption 数
 * @Date 2019/12/17/017
 **/
public class Test68_1 {
    /**
     * 如果是二叉排序树
     * 根节点的一定是比p大，但是比q要小，
     * 如果是都大，向左孩子递归。如果都小，向右孩子递归
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root == null){
            return root;
        }
        if (root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}
