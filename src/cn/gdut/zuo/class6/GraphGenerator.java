package cn.gdut.zuo.class6;

/**
 * @Desctiption 生成图
 * @Date 2019/12/31/031
 **/
public class GraphGenerator {
    public static Graph createGraph(Integer [][] matrix){
        Graph graph = new Graph();
        for (int i = 0; i < matrix.length ; i++){
            Integer weight = matrix[i][0];
            Integer from = matrix[i][1];
            Integer to = matrix[i][2];
            // 不含有这条边
            if (!graph.nodes.containsKey(from)){
                graph.nodes.put(from, new Node(from));
            }
            if (!graph.nodes.containsKey(to)){
                graph.nodes.put(to, new Node(to));
            }
            // 获取两个节点，边赋权值
            Node fromNode = graph.nodes.get(from);
            Node toNode = graph.nodes.get(to);
            Edge newEdge = new Edge(weight, fromNode, toNode);
            fromNode.nexts.add(toNode);
            // 出度入度加1
            fromNode.out++;
            toNode.in++;
            fromNode.edges.add(newEdge);
            graph.edges.add(newEdge);
        }
        return graph;
    }
}
