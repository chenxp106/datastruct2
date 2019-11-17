package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 打印多行
 */
public class Test32_2 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> resutlt = new ArrayList<>();
        if (pRoot == null){
            return resutlt;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> curRes = new ArrayList<>();
            while (size-- > 0){
                // 出队
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
            resutlt.add(curRes);
        }
        return resutlt;
    }
}
