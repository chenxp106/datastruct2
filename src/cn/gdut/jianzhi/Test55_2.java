package cn.gdut.jianzhi;

/**
 * @Desctiption 平衡二叉树
 * @Date 2019/12/6/006
 **/
public class Test55_2 {

    /*public boolean IsBalanced_Solution(TreeNode root){
        if (root == null){
            return true;
        }
        return check(root);
    }

    private boolean check(TreeNode root){
        if (root == null){
            return true;
        }
        int left = deep(root.left);
        int right = deep(root.right);
        if (Math.abs(left - right) > 1){
            return false;
        }
        else {
            return check(root.left) && check(root.right);

        }
    }

    private int deep(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = deep(root.left);
        int right = deep(root.right);
        return Math.max(left,right) + 1;
    }*/

    private boolean isBalanced = true;

    public boolean IsBalanced_Solution(TreeNode root){
        if (root == null){
            return true;
        }
         deep(root);
        return isBalanced;
    }

    private int deep(TreeNode root){
        if (root == null || !isBalanced){
            return 0;
        }
        int left = deep(root.left);
        int right = deep(root.right);
        if (Math.abs(left - right) > 1){
            isBalanced = false;

        }
        return 1 + Math.max(left, right);
    }
}
