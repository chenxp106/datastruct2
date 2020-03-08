package cn.gdut.leetcode.sousuo.DFS;

/**
 * @ClassName NumIsland
 * @Desctiption 岛屿的数量
 * @Date 2020/3/8 9:47
 */
public class NumIsland {
    private int m, n;
    private int [][] dir = {{0,1}, {0,-1}, {-1,0}, {1,0}};

    public int numIsland(int [][] grid){
        m = grid.length;
        n = grid[0].length;
        int number = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if(grid[i][j] != 0){
                    number++;
                    dfs(grid, i, j);
                }
            }
        }
        return number;
    }

    // 深度遍历
    private void dfs(int [][] grid, int  r, int c){
        if (r >= m || r < 0 || c >= n || c < 0 || grid[r][c] == 0) {
            return;
        }
        // 标记访问
        grid[r][c] =  0;
        // 从四个方向访问
        for (int [] d : dir ){
            dfs(grid, r + d[0], c + d[1]);
        }
    }
}
