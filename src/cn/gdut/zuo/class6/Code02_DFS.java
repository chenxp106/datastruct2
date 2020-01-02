package cn.gdut.zuo.class6;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @Desctiption 深度优先遍历
 * 1.利用栈实现
 * 2.从源节点开始把节点按照深度放入栈中，然后弹出，
 * 3、每弹出一个点，把该节点下一个没有进过栈的邻接节点放入栈中
 * 4.直到栈变空
 * @Date 2020/1/2/002
 **/
public class Code02_DFS {
    /**
     * 深度优先，用栈
     * @param node
     */
    public static void dfs(Node node){
        if (node == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Set<Node> set = new HashSet<>();
        // 进栈和队列
        stack.push(node);
        set.add(node);
        System.out.println(node.value);
        while (!stack.isEmpty()){
            Node cur = stack.pop();
            for (Node next : cur.nexts){
                if (!set.contains(next)){
                    stack.push(cur);
                    stack.push(next);
                    set.add(next);
                    System.out.println(next.value);
                    break;
                }
            }
        }
    }
}
