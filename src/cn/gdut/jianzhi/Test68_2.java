package cn.gdut.jianzhi;

/**
 * @Desctiption 若是普通的二叉树
 * 在左右子树中查找是否存在p和q，如果p和q分别在两颗子树中，那么说明根节点是最低的公共祖先
 * @Date 2019/12/17/017
 **/
public class Test68_2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){

        if (root == null || p == null || q== null){
            return root;
        }
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        return left == null ? right : (right == null) ? left : root;

    }
}
