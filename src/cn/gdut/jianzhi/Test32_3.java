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
        boolean flag = false;
        while (!queue.isEmpty()){
            int size = queue.size();
            // 每一行的结果
            ArrayList<Integer> curRes = new ArrayList<>();
            while (size-- > 0){
                // 出队
                TreeNode node = queue.poll();
                // 访问它
                curRes.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }

            }
            // 在最后，加上这一行的结果
            if (flag){
                Collections.reverse(curRes);
            }
            flag = !flag;
            res.add(curRes);
        }
        return res;
    }
}
