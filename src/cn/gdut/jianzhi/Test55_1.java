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
        int left = deep(p.left)+1;
        int right = deep(p.right)+1;
        return Math.max(left,right);
    }
}
