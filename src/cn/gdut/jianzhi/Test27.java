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
        reverser(root);

    }

    /**
     * 递归交换
     * @param root
     * @return
     */
    private TreeNode reverser(TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode tmp = root.left;
        root.left = reverser(root.right);
        root.right = reverser(tmp);
        return root;
    }
}
