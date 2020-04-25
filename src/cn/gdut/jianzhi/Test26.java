package cn.gdut.jianzhi;

/**
 * 判断树B是不是为A的子树。
 * 递归B为空，则说明前面匹配完整。返回true。
 * 若A为空，说明不匹配。
 * 下来是AB都不为空，如果值不相等。不匹配
 * 然后递归AB的子树。
 *
 * 在主方法中。需要判断三个。A的左右子树与B。A与B
 */
public class Test26 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2){
        if (root1 == null || root2 == null){
            return false;
        }
        return isSubtree(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    private boolean isSubtree(TreeNode root1, TreeNode root2){
        if ( root2 == null){
            return true;
        }
        if (root1 == null ){
            return false;
        }
        if (root1.val != root2.val){
            return false;
        }
        return isSubtree(root1.left, root2.left) && isSubtree(root1.right, root2.right);
    }
}












