package cn.gdut.jianzhi;

import java.util.HashMap;
import java.util.Map;

public class Test7 {

/*    // 用于存储中序遍历中的
    private Map<Integer,Integer> inOrder = new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] pre, int [] in){
        for (int i = 0 ;i<in.length;i++){
            inOrder.put(in[i], i);
        }
        return reConstructBinary(pre, 0, pre.length-1, 0);
    }

    *//**
     * 用于重构二叉树
     * @param pre 先序遍历
     * @param preL 先序起始
     * @param preR 先序终点
     * @param inL 中序起点
     * @return 重构的二叉树节点
     *//*
    private TreeNode reConstructBinary(int [] pre, int preL, int preR, int inL){
        if (preL > preR){
            return null;
        }
        // 先序第一个节点作为根节点
        TreeNode root = new TreeNode(pre[preL]);
        // 获取根节点在中序遍历的位置
        int inIndex = inOrder.get(root.val);
        // 获取左子树的个数
        int leftSize = inIndex - inL;
        // 构建左子树
        root.left = reConstructBinary(pre, preL+1,preL+leftSize,inL);
        root.right = reConstructBinary(pre,preL+leftSize+1,preR,inL+leftSize+1);
        return root;
    }*/

    // 用map存储中序遍历中的位置
    Map<Integer, Integer> map = new HashMap<>();

    // 重建二叉树
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        for (int i = 0;i < in.length; i++){
            map.put(in[i], i);
        }

        return reContruct(pre, 0, pre.length - 1, 0);
    }

    private TreeNode reContruct(int [] pre, int preL, int preR, int inL ){
        if (preL > preR){
            return null;
        }
        int cur = pre[preL];
        TreeNode curNode = new TreeNode(cur);
        // 找到第一个数在中序遍历的位置
        Integer inIndex = map.get(cur);
        // 获取左子树的个数
        int leftSize = inIndex - inL;
        curNode.left = reContruct(pre, preL + 1, preL + leftSize, inL);
        curNode.right = reContruct(pre, preL + leftSize + 1, preR,inL + leftSize + 1);
        return curNode;
    }

}
