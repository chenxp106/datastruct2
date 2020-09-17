package cn.gdut.jianzhi;

/**
 * @Desctiption 二叉树中的第k个节点
 * @Date 2019/12/5/005
 **/
public class Test54 {


    int cnt = 0;
    int res = 0;
    public int kthLargest(TreeNode root, int k) {
        if (root == null || k <= 0){
            return 0;
        }
        inOrder(root, k);
        return res;
    }
    private void inOrder(TreeNode root, int k){
        if (root == null){
            return;
        }
        inOrder(root.right, k);
        cnt++;
        if (cnt == k){
            res = root.val;
            return;
        }
        inOrder(root.left, k);
    }




























    /*TreeNode ret = null;
    int cnt = 0;
    TreeNode KthNode(TreeNode pRoot, int k){
        if (pRoot == null || k < 0){
            return null;
        }
        inOrder(pRoot, k);
        return ret;
    }

    private void inOrder(TreeNode root, int k){
        if (root == null || cnt >= k){
            return ;
        }
        inOrder(root.left, k);
        cnt++;
        if (cnt == k){
            ret = root;
        }
        inOrder(root.right, k);
    }*/
}
