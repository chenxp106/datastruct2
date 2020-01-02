package cn.gdut.zuo.class6;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Desctiption 图的定义
 * @Date 2019/12/31/031
 **/
public class Graph {
    // 编号：节点
    public HashMap<Integer, Node> nodes;
    public HashSet<Edge> edges;
    public Graph(){
        nodes = new HashMap<>();
        edges = new HashSet<>();
    }
}
