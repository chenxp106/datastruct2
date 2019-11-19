package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Test32_3 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        boolean flag = true;
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> curRes = new ArrayList<>();
            while (size-- > 0){
                // 出队列
                TreeNode node = queue.poll();
                //访问它
                curRes.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            flag = !flag;
            if (flag){
                // 翻转数组
                Collections.reverse(curRes);
            }
            res.add(curRes);
        }
        return res;
    }
}
