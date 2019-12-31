package cn.gdut.zuo.class6;

/**
 * @Desctiption 图中边的定义
 * @Date 2019/12/31/031
 **/
public class Edge {

    // 权重
    public int weight;
    // 从哪个点出来
    public Node from;
    // 到哪个店
    public Node to;
    public Edge(int weight, Node from, Node to){
        this.weight = weight;
        this.from = from;
        this.to = to;
    }
}
