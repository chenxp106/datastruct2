package cn.gdut.jianzhi;

/**
 * @Desctiption 二叉树的深度
 * @Date 2019/12/5/005
 **/
public class Test55_1 {
    public int TreeDepth(TreeNode root){
        return deep(root);
    }

    private int deep(TreeNode p){
        if (p == null){
            return 0;
        }
        // 分别求出左右子树的高度
        int left = deep(p.left);
        int right = deep(p.right);
        return Math.max(left, right) + 1;
    }
}
