package cn.gdut.zuo.class6;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @Desctiption 图的广度优先
 * 1.利用队列实现
 * 2.从源节点开始依次按照宽度进队列，然后弹出
 * 3.没弹出一个点，把该节点所有没有进过队列的邻接点放入到队列中
 * 4.知道队列为空
 * @Date 2020/1/2/002
 **/
public class Code01_BFS {
    /**
     * 在这里set相当于是标记数组，用于记录当前节点是否被访问过
     * @param node
     */
    public static void bfs(Node node) {
        if (node == null){
            return;
        }
        // 定义队列和Set
        Queue<Node> queue = new LinkedList<>();
        Set<Node> set = new HashSet<>();
        // 将第一个节点加入
        queue.add(node);
        set.add(node);
        while (!queue.isEmpty()){
            Node pollNode = queue.poll();
            System.out.println(pollNode.value);
            // 遍历与当前node相连的所有点，并加入到set中
            for (Node next : pollNode.nexts){
                // set中没有这个next，才放入到队列和set中
                if (!set.contains(next)){
                    set.add(next);
                    queue.add(next);
                }
            }

        }
    }
}
