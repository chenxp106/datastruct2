package cn.gdut.leetcode.stackandqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName LevelOrder
 * @Desctiption TODO
 * @Date 2020/4/3 9:06
 */
public class LevelOrder {
    public List<List<Integer>> leverOrder(TreeNode root){

        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        // 用队列实现
        Queue<TreeNode> queue = new LinkedList<>();
        ((LinkedList<TreeNode>) queue).push(root);

        while (!queue.isEmpty()){
            int count = queue.size();
            List<Integer> list = new ArrayList<>();
            while (count-- > 0){
                TreeNode cur = ((LinkedList<TreeNode>) queue).pop();
                list.add(cur.val);
                if (cur.left != null){
                    queue.add(cur.left);
                }
                if (cur.right != null){
                    queue.add(cur.right);
                }
            }
            res.add(list);
        }

        return res;
    }
}



























