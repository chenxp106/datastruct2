package cn.gdut.leetcode.stackandqueue;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName PreorderTraversal
 * @Desctiption TODO
 * @Date 2020/3/31 17:10
 */
public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null){
            return res;
        }
        stack.push(root);
        while ( !stack.isEmpty()){
            TreeNode cur = stack.pop();
            res.add(cur.val);
            if (cur.right != null){
                stack.push(cur.right);
            }
            if (cur.left != null){
                stack.push(cur.left);
            }
        }
        return res;

    }
}




























