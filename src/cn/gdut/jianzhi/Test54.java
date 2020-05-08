package cn.gdut.jianzhi;

/**
 * @Desctiption 二叉树中的第k个节点
 * @Date 2019/12/5/005
 **/
public class Test54 {
    /*// 返回的节点
    private TreeNode ret;
    private int cnt = 0;
    TreeNode KthNode(TreeNode pRoot, int k){
        inOrder(pRoot, k);
        return ret;
    }
    private void inOrder(TreeNode p,int k){
        // 如果为空或是计数大于k，返回。即出口
        if (p == null || cnt >= k){
            return ;
        }
        // 遍历左子树
        inOrder(p.left, k);
        cnt++;
        // 遍历根节点
        if (cnt == k){
            ret = p;
        }
        // 遍历右子树
        inOrder(p.right,k);
    }*/
    TreeNode ret = null;
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
    }
}
