package cn.gdut.bishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class jinshanyun2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().trim().split(" ");
        List<Integer> list = new ArrayList<>();

        String[] s1 = sc.nextLine().trim().split(" ");
        int p1 = Integer.valueOf(s1[0]);
        int p2 = Integer.valueOf(s1[1]);



        for (String x : s){
            list.add(Integer.valueOf(x));
        }
        TreeNode tree = buildTree(list).root;
        TreeNode t1 = new TreeNode(p1);
        TreeNode t2 = new TreeNode(p2);

        TreeNode treeNode = lowestCommonAncestor(tree, t1.val, t2.val);
        System.out.println(treeNode.val);


    }



    public static TreeNode lowestCommonAncestor(TreeNode root, int p, int q){

        if (root == null ){
            return null;
        }

        TreeNode right = lowestCommonAncestor(root.right, p, q);
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        return left == null ? right : (right == null) ? left : root;

    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // 构建树
    private static  class Tree {
        private	TreeNode root;
        private	int used;//用掉了多少个节点
    }
    private static Tree buildTree(List<Integer> preorder){
        if(preorder.size()==0){//574##18##4没有给全
            Tree returnVAlue=new Tree();
            returnVAlue.root=null;
            return returnVAlue;
        }
        //找到根的值
        int rootValue=preorder.get(0);
        if(rootValue== -1){
            Tree returnValue=new Tree();
            returnValue.root=null;
            returnValue.used=1;
            return returnValue;
        }
        //传给左子树去创建
        Tree leftReturn=buildTree(preorder.subList(1,preorder.size()));
        Tree rightReturn=buildTree(preorder.subList(1+leftReturn.used,preorder.size()));
        TreeNode root=new TreeNode(rootValue);
        root.left=leftReturn.root;
        root.right=rightReturn.root;

        Tree returnValue=new Tree();
        returnValue.root=root;
        returnValue.used=1+leftReturn.used+rightReturn.used;
        return returnValue;
    }
}
