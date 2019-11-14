package cn.gdut.jianzhi;

/**
 * 二叉树的镜像
 * 先将一个节点保存起来，然后递归交换两个节点
 */
public class Test27 {
    public void Mirror(TreeNode root){
        if (root == null){
            return;
        }
        reverse(root);
    }

    private TreeNode reverse(TreeNode root){
        //递归出口
        if (root == null){
            return null;
        }
        TreeNode tmp = root.left;
        root.left = reverse(root.right);
        root.right = reverse(tmp);
        return root;
    }


}
