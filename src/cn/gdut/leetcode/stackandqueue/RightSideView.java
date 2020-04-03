package cn.gdut.leetcode.stackandqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName RightSideView
 * @Desctiption TODO
 * @Date 2020/4/3 9:40
 */
public class RightSideView {
    public List<Integer> rightSideView(TreeNode root){

        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        // 用队列实现
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while ( !queue.isEmpty()){
            int count = queue.size();
            for (int i = 0; i < count; i++){
                TreeNode cur = queue.poll();
                if (cur.left != null){
                    queue.add(cur.left);
                }
                if (cur.right != null){
                    queue.add(cur.right);
                }
                // 当走到最后边时，加上那个元素
                if (i == count - 1){
                    res.add(cur.val);
                }
            }
        }
        return res;
    }
}










