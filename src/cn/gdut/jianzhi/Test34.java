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
        if (root == null || target < 0){
            return res;
        }
        // 回溯递归
        tracking(target, root, new ArrayList<>());
        return res;
    }

    private void tracking(int target, TreeNode root, ArrayList<Integer> path){
        // 出口
        if (root == null){
            return;
        }
        // 添加路径
        path.add(root.val);
        target -= root.val;
        if (isLeaf(root) && target == 0){
            // 一条路径，并添加到输出结果中
            res.add(new ArrayList<>(path));
        }
        // 否则，递归左右子树
        else {
            tracking(target, root.left, path);
            tracking(target, root.right, path);
        }
        // 退出最后一个元素
        path.remove(path.size() - 1);

    }

    private boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }

}
