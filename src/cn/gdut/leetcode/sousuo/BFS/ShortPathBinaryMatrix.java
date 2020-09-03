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
        // 八个方向
        int [][] dir = {{1, -1}, {1, 0}, {1, 1}, {0, -1}, {0, 1}, {-1, -1}, {-1, 0}, {-1, 1}};
        int m = grid.length;
        int n = grid[0].length;
        // 路径长度
        int pathLenght = 0;
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(0,0));
        while (!queue.isEmpty()){
            // 队列中的个数
            int size = queue.size();
            pathLenght++;
            while (size-- > 0){
                Pair<Integer, Integer> poll = queue.poll();
                // 获取坐标的位置
                Integer i = poll.getKey();
                Integer j = poll.getValue();
                // 坐标为1,不可通行
                if (grid[i][j]  == 1){
                    continue;
                }
                // 到达终点
                if (i == m - 1 && j == n - 1){
                    return pathLenght;
                }
                // 否则表示可以通行，同时标记访问
                grid[i][j] = 1;
                // 从8个方向出发
                for (int [] d : dir){
                    // 这里需要重新定义变量
                    int ni = i + d[0];
                    int nj = j + d[1];
                    if (ni < 0 || nj < 0 || ni >= m || nj >= n){
                        continue;
                    }
                    // 将节点加入到队列中
                    queue.add(new Pair<>(ni, nj));
                }
            }
        }
        return -1;
    }
}
