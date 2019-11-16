package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 层次遍历，用队列
 */
public class Test32_1 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            // 出队列
            TreeNode cur = queue.poll();
            // 访问它
            result.add(cur.val);
            if (cur.left != null){
                // 进队列
                queue.add(cur.left);
            }
            if (cur.right != null){
                queue.add(cur.right);
            }
        }
        return result;
    }
}
