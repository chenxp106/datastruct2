package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 层次遍历，用队列
 */
public class Test32_1 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null ){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size -- > 0){
                TreeNode cur = queue.poll();
                if (cur == null){
                    continue;
                }
                res.add(cur.val);
                if (cur.left != null){
                    queue.add(cur.left);
                }
                if (cur.right != null){
                    queue.add(cur.right);
                }
            }
        }
        return res;
    }
}
