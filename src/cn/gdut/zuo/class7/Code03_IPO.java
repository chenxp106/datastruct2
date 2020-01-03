package cn.gdut.zuo.class7;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Desctiption 项目收益，最大收益
 * 本质上还是属于贪心算法，每次都选择收益最大项目
 *
 * @Date 2020/1/3/003
 **/
public class Code03_IPO {
    public static class Node {
        // cost支出
        public int p;
        // 利润
        public int c;
        public Node(int p, int c){
            this.p = p;
            this.c = c;
        }
    }
    /**
     * 最多可以做k个项目，
     * 利润是profits，
     * @param k 最多可以做k个项目
     * @param w 启动资金是w
     * @param Profits 利润数组
     * @param Capital 每个项目的支出
     * @return 最大的值
     */
    public static int findMaxminzedCapital(int k, int w, int [] Profits, int [] Capital){
        Node [] nodes = new Node[Profits.length];
        // 将数据放入节点数组中
        for (int i = 0;i < Profits.length; i++){
            nodes[i] = new Node(Profits[i], Capital[i]);
        }
        // 建立大小根堆。大根堆存储，收益
        PriorityQueue<Node> maxHeap = new PriorityQueue<>((o1, o2) -> o2.p - o1.p);
        // 小根堆存储cost的值，从小到大排序
        PriorityQueue<Node> minHeap = new PriorityQueue<>((o1, o2) -> o1.c - o2.c);
        // 先将node节点进入到小根堆中
        minHeap.addAll(Arrays.asList(nodes));
        // 拿出最上面的值，如果成本小于现有的资金。就将它放入到大根堆中。从大根堆中选择利润最大的项目来做
        for (int i = 0; i < k; i++){
            // 小根堆中不为空，并且有够的成本，则开始做项目
            while (!minHeap.isEmpty() && minHeap.peek().c <= w){
                maxHeap.add(minHeap.poll());
            }
            if (maxHeap.isEmpty()){
                return w;
            }
            w += maxHeap.poll().p;
        }
        // 返回最后的收益
        return w;
    }
}
