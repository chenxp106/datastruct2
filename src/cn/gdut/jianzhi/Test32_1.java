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
        // 定义一个队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            // 出队列
            TreeNode node = queue.poll();
            // 访问它
            result.add(node.val);
            // 将左右子树放入队列中
            if (node.left != null){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
        return result;
    }
}
