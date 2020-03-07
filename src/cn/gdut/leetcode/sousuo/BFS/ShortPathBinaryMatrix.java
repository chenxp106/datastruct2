package cn.gdut.leetcode.sousuo.BFS;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName ShortPathBinaryMatrix BFS
 * @Desctiption 最短路径
 *
 * 广度遍历的套路
 * 1、先定义队列。
 * 2、将元素加入到队列中，遍历队列不为空。
 * 3、统计队列中元素的个数，再次遍历。相当于一次广度，深度加1；
 * 4、取出元素的值，判断是否到达终点。达到，退出。
 * 5、否则，说明还没到达终点，标记已经访问。
 * 6、从各个反向遍历，还需要判断边界，并且加入当前的节点。
 *
 * @Date 2020/3/7 9:47
 */
public class ShortPathBinaryMatrix {
    public int shortPathBinaryMatrix(int [][] grid){
        // 判空
        if (grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        // 四个方向
        int [][] dir = {{1, -1}, {1, 0}, {1, 1}, {0, -1}, {0, 1}, {-1, -1}, {-1, 0}, {-1, 1}};
        // 计算长宽
        int m = grid.length;
        int n = grid[0].length;
        // 定义队列,Pair装的是坐标
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(0,0));
        // 长度
        int pathLength = 0;
        // 遍历队列
        while( !queue.isEmpty()){

            int size = queue.size();
            pathLength++;
            while(size-- > 0){
                // 出一个元素
                Pair<Integer,Integer> cur = queue.poll();
                // 获取横纵坐标
                int cr = cur.getKey(), cc = cur.getValue();
                // 如果该坐标的值为1，说明不可达
                if (grid[cr][cc] == 1){
                    continue;
                }
                // 如果到达终点
                if( cc == m -1 && cr == n - 1){
                    return pathLength;
                }
                // 同时标记已访问
                grid[cr][cc] = 1;
                // 遍历八个方向
                for(int [] d : dir) {
                    int nr = cr + d[0];
                    int nc = cc + d[1];
                    // 如果越界，continue
                    if ( nr < 0 || nr >= m || nc < 0|| nc >= n){
                        continue;
                    }
                    // 将当前节点加入队列中
                    queue.add(new Pair(nr,nc));
                }
            }

        }
        return -1;
    }
}
