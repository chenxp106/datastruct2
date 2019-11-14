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

    private boolean isSys(TreeNode root1,TreeNode root2){
        //如果两个都为空，则是对称的
        if (root1 == null && root2 == null){
            return true;
        }
        //如果有一个为空
        if (root1 == null || root2 == null){
            return false;
        }
        //值要相等
        if (root1.val != root2.val){
            return false;
        }
        // 递归.即一个左边要等于右边。右边的值要等于左边
        return isSys(root1.left, root2.right) && isSys(root1.right, root2.left);
    }


}
