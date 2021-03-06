package cn.gdut.jianzhi;

/**
 * 判断对称二叉树
 */
public class Test28 {

    public boolean isSymmetrical(TreeNode pRoot){
        if (pRoot == null){
            return true;
        }
        return isSys(pRoot.left, pRoot.right);
    }
    private boolean isSys(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null){
            return true;
        }
        if (root1 == null || root2 == null){
            return false;
        }
        if (root1.val != root2.val){
            return false;
        }
        return isSys(root1.left, root2.right) && isSys(root1.right, root2.left);
    }

}
