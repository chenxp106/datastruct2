package cn.gdut.leetcode.tracking;

/**
 * @ClassName Exist
 * @Desctiption 79 单词搜索
 * @Date 2020/4/12 9:48
 */
public class Exist {
    private int m, n;
    private int [][] dir = {{1,0}, {-1, 0}, {0,-1}, {0,1}};

    public boolean exist(char [][] board, String word){
        if (word == null || word.length() == 0){
            return true;
        }
        if (board == null || board.length == 0 || board[0].length == 0){
            return false;
        }
        m = board.length;
        n = board[0].length;
        char[] array = word.toCharArray();
        boolean [][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (tracking(board,array, 0, i, j, visited)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean tracking(char [][] board, char [] array, int curLen, int i,int j, boolean [][] visited){
        if (curLen == array.length){
            return true;
        }

        // 判断越界
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j] || board[i][j] != array[curLen]){
            return false;
        }
        // 标记访问
        visited[i][j] = true;
        for (int [] d : dir){
            if (tracking(board, array, curLen+1, i + d[0], j + d[1], visited)){
                return true;
            }
        }
        // 标记未被访问
        visited[i][j] = false;
        return false;
    }
}














