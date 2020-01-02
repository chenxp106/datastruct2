package cn.gdut.zuo.class6;

import java.util.*;

/**
 * @Desctiption 拓扑排序
 * 入度为0的点先删掉
 * 然后将入度为0的点放入到队列中。
 *
 * @Date 2020/1/2/002
 **/
public class Code03_TopologySort {
    // 有向图，并且是无环
    public static List<Node> sortedTopogy(Graph graph){
        // inMap.入度图
        HashMap<Node, Integer> inMap = new HashMap<>();
        // 0入度的节点
        Queue<Node> zeroInQuere = new LinkedList<>();
        // graph.nodes.values()拿到所有节点，这一步是遍历所有的点
        for (Node node : graph.nodes.values()){
            // 把所有点的入度放入inMap中
            inMap.put(node, node.in);
            if (node.in == 0){
                zeroInQuere.add(node);
            }
        }
        // 遍历队列中的节点
        List<Node> result = new ArrayList<>();
        while (!zeroInQuere.isEmpty()){
            // 从队列中出一个节点
            Node cur = zeroInQuere.poll();
            result.add(cur);
            for (Node next : cur.nexts){
                // 将入度-1，相当于清除了之前的节点
                inMap.put(next, inMap.get(next) - 1);
                // 如果当前的节点为0，将它送入到队列中
                if (inMap.get(next) == 0){
                    zeroInQuere.add(next);
                }
            }
        }
        return result;
    }
}
