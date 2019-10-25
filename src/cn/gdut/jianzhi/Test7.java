package cn.gdut.jianzhi;

import java.util.HashMap;
import java.util.Map;

public class Test7 {
    private Map<Integer, Integer> map = new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] pre, int [] in){
        // 将中序遍历的下标存储起来
        for (int i = 0;i<in.length ;i++){
            map.put(in[i],i);
        }
        return reContructBinaryTree(pre, 0, pre.length - 1,0);
    }

    /**
     * 递归构建二叉树
     * @param pre 先序遍历的数组
     * @param preL 先序起始下标
     * @param preR 先序最后一个下标
     * @param inL 中序的第一个下标
     * @return 构建好的二叉树的头结点
     */
    private TreeNode reContructBinaryTree(int [] pre, int preL, int preR, int inL){
        if (preL > preR){
            return null;
        }
        // 先序遍历的第一个节点即为个头结点
        TreeNode root = new TreeNode(pre[preL]);
        // 找到先序遍历的第一个元素在中序遍历中的位置
        int inIndex = map.get(root.val);
        // 当前节点左子树的个数
        int leftTreeSize = inIndex - inL;
        // 循环构建二叉树，先在左子树
        root.left = reContructBinaryTree(pre, preL+1, preL+leftTreeSize,inL);
        //构建右子树
        root.right = reContructBinaryTree(pre, preL+leftTreeSize+1, preR,inL+leftTreeSize+1);
        return root;
    }
}
