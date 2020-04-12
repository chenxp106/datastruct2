package cn.gdut.leetcode.tracking;

/**
 * @ClassName NumIslands
 * @Desctiption 200 岛屿的数量
 * @Date 2020/4/12 10:55
 */
public class NumIslands {
    private int m, n;
    private int [][] dir = {{0,1}, {0,-1}, {-1,0}, {1,0}};
    private int numIslands(char [][] grid){
        if (grid == null || grid.length == 0){
            return 0;
        }
        m = grid.length;
        n = grid[0].length;
        int num = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] != '0'){
                    num++;
                    dfs(grid, i, j);
                }
            }
        }
        return num;
    }

    private void dfs(char [][] grid, int i, int j){
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0'){
            return;
        }
        // 标记访问
        grid[i][j] = '0';
        // 从四个方向
        for (int [] d : dir){
            dfs(grid, i + d[0], j + d[1]);
        }
    }
}


















