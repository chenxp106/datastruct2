package cn.gdut.jianzhi;

/**
 * @Desctiption 平衡二叉树
 * @Date 2019/12/6/006
 **/
public class Test55_2 {


    boolean isBalance = true;
    public boolean isBalanced(TreeNode root) {

        if (root == null){
            return true;
        }
        height(root);
        return isBalance;
    }

    private int height(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1 || !isBalance){
            isBalance = false;
            return 0;
        }
        else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }































    /*private boolean isBalance = true;
    public boolean IsBalanced_Solution(TreeNode root){
        if (root == null){
            return true;
        }
        height(root);
        return isBalance;
    }

    private int height(TreeNode root){
        if (root == null || !isBalance){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right ) > 1){
            isBalance = false;
            return 0;
        }
        else {
            return Math.max(left, right) + 1;
        }
    }*/

}
