package cn.gdut.leetcode.sousuo.backtracking;

/**
 * @ClassName Exist
 * @Desctiption TODO
 * @Date 2020/3/15 9:09
 */
public class Exist {

    private int m,n;
    private int [][] dir = {{1,0}, {-1, 0}, {0,-1}, {0,1}};
    public boolean exist(char [][] board, String word){
        m = board.length;
        n = board[0].length;
        char[] array = word.toCharArray();
        boolean [][] visited =new boolean[m][n];

        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (trackin(board, array, 0, i, j, visited)){
                    return true;
                }
            }
        }
        return false;

    }

    private boolean trackin(char [][] board, char [] array, int curLen, int i, int j, boolean [][] visited){
        if (array.length == curLen){
            return true;
        }
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j] || board[i][j] != array[curLen] ){
            return false;
        }
        // 标记访问
        visited[i][j] = true;
        // 遍历四个方向
        for (int [] d : dir){
            if (trackin(board,array, curLen + 1, i + d[0], j + d[1],visited)){
                return true;
            }
        }
        visited[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        Exist exist = new Exist();
        char [][] board = {{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        System.out.println(exist.exist(board,"ABCB"));
    }

}
