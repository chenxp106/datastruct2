package cn.gdut.zuo.class6;

import java.util.ArrayList;

/**
 * @Desctiption 图点的定义
 * @Date 2019/12/31/031
 **/
public class Node {
    // 值
    public int value;
    // 入度
    public int in;
    // 出度
    public int out;
    public ArrayList<Node> nexts;
    public ArrayList<Edge> edges;

    public Node(int value){
        this.value = value;
        in = 0;
        out = 0;
        nexts = new ArrayList<>();
        edges = new ArrayList<>();
    }

}
