package cn.gdut.zuo.class4;

import cn.gdut.zuo.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Desctiption 树的序列化 反序列化 重建二叉树
 * @Date 2019/12/27/027
 **/
public class Code04_SerializeAndReconstructTree {

    /**
     * 序列化
     * 先序遍历，
     * @param head
     * @return
     */
    public static String serialByPre(TreeNode head){
        // 出口
        if (head == null){
            return "#!";
        }
        String res = head.val + "!";
        res += serialByPre(head.left);
        res += serialByPre(head.right);
        return res;
    }

    /**
     * 通过字符串重建二叉树
     * @param preStr
     * @return
     */
    public static TreeNode reconByString(String preStr){
        String[] values = preStr.split("!");
        Queue<String> queue = new LinkedList<>();
        // 将每一个值放入到队列中
        for (int i = 0;i < values.length; i++){
            queue.offer(values[i]);
        }
        return reconByPreOder(queue);
    }

    /**
     * 传入队列重建二叉树
     * @param queue
     * @return
     */
    public static TreeNode reconByPreOder(Queue<String> queue){
        String value = queue.poll();
        if ("#".equals(value)){
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(value));
        node.left = reconByPreOder(queue);
        node.right = reconByPreOder(queue);
        return node;
    }
}
