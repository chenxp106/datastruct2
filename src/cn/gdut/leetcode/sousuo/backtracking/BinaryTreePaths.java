package cn.gdut.leetcode.sousuo.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BinaryTreePaths
 * @Desctiption TODO
 * @Date 2020/3/15 10:25
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root){
        List<String> ret = new ArrayList<>();
        if (root == null){
            return  ret;
        }
        List<Integer> values = new ArrayList<>();
        tracking(root, ret, values);
        return ret;

    }

    private void tracking(TreeNode node, List<String> ret, List<Integer> values){
        if (node == null){
            return;
        }
        values.add(node.val);
        // 如果到达了根节点
        if (isLeaf(node)){
            // 将该路径加到ret中
            ret.add(build(values));
        }
        else {
            tracking(node.left, ret,values);
            tracking(node.right, ret, values);
        }
        values.remove(values.size() - 1);

    }

    private boolean isLeaf(TreeNode root){
        return (root.left == null) && (root.right == null);
    }
    // 根据list中的值建立节点
    private String build(List<Integer> values){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < values.size(); i++){
            builder.append(values.get(i));
            if (i != values.size() - 1){
                builder.append("->");
            }
        }
        return builder.toString();
    }
}










