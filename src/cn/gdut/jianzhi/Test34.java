package cn.gdut.jianzhi;

import java.util.ArrayList;

/**
 * @Desctiption TODO
 * @Date 2019/11/18/018
 **/
public class Test34 {
    // 全局返回的结果
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target){
        if (root == null){
            return res;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        // 回溯
        tracking(root, temp, target);
        return res;
    }

    private void tracking(TreeNode root, ArrayList<Integer> temp, int target){
        if (root == null){
            return;
        }
        // 加入这个节点
        temp.add(root.val);
        target -= root.val;
        // 判断是不是叶子节点，并且target==0
        if (isLeaf(root) && target == 0){
            res.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
            return;
        }
        tracking(root.left, temp, target);
        tracking(root.right, temp, target);
        temp.remove(temp.size() - 1);
    }

    private boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
}
