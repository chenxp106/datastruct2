package cn.gdut.leetcode.sousuo.DFS;

/**
 * @ClassName Solve
 * @Desctiption TODO
 * @Date 2020/3/9 20:51
 */
public class Solve {
    private int [][] dir = {{1,0}, {-1,0},{0,1}, {0,-1}};
    private int m, n;
    public void solve(char [][] board){
        if (board == null || board.length == 0){
            return;
        }
        m = board.length;
        n = board[0].length;
        // 填充第一列和最后一列
        for (int i = 0; i < m; i++){
            dfs(board, i, 0);
            dfs(board, i,m - 1);
        }
        // 填充第1行和最后一行
        for (int i = 0; i < n; i++){
            dfs(board, 0, i);
            dfs(board, m -1 ,i);
        }
        // 将里面的替换就行
        for (int i = 0; i < m;i++){
            for (int j = 0; j < n; j++){
                // 边边界填充回去
                if (board[i][j] == 'T'){
                    board[i][j] = '0';
                }
                else if (board[i][j] == '0'){
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(char [][] board, int r, int c){
        if (r < 0 || r >= m || c < 0 || c >= n || board[r][c] != '0'){
            return;
        }
        // 标记为T
        board[r][c] = 'T';
        // 从四个方向遍历
        for (int [] d : dir){
            dfs(board, r + d[0], c + d[1]);
        }
    }
}
