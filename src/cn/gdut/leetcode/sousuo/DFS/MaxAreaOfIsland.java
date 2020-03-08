package cn.gdut.leetcode.sousuo.DFS;

/**
 * @ClassName MaxAreaOfIsland
 * @Desctiption 岛屿的最大面积
 *
 * 求岛屿的最大面积。从一个地方开始遍历。每走一个地方，就标记访问。
 *
 * @Date 2020/3/8 9:29
 */

public class MaxAreaOfIsland {
    private int m, n;
    private int [][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    private int max = 0;
    public int maxAreaOfIsland(int[][] grid) {
        // 判空
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        m = grid.length;
        n = grid[0].length;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if(grid[i][j] != 0){
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }

    // dfs递归调用
    private int dfs(int [][] grid, int r, int c){
        // 递归出口
        if (r >= m || r < 0|| c >= n || c < 0 || grid[r][c] == 0 ){
            return 0;
        }
        // 标记访问
        grid[r][c] = 0;
        int area = 1;
        // 遍历四个方向
        for (int [] d : dir) {
            area += dfs(grid, r + d[0], c + d[1]);
        }
        return area;
    }
}
