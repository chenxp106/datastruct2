package cn.gdut.leetcode.tree;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BinaryTreePaths
 * @Desctiption 257 返回从根节点到叶子节点的所有路径
 * @Date 2020/3/26 20:45
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root){
        List<String> ret = new ArrayList<>();
        if (root == null){
            return ret;
        }
        if (root.left == null && root.right == null){
            ret.add(String.valueOf(root.val));
            return ret;
        }
        List<String> leftS = binaryTreePaths(root.left);
        for (int i = 0; i < leftS.size(); i++){
            ret.add(String.valueOf(root.val) + "->" + leftS.get(i));
        }
        List<String> rightS = binaryTreePaths(root.right);
        for (int i = 0; i < rightS.size(); i++){
            ret.add(String.valueOf(root.val) + "->" + rightS.get(i));
        }
        return ret;
    }
}














