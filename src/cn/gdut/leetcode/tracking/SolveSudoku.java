package cn.gdut.leetcode.tracking;

/**
 * @ClassName SolveSudoku
 * @Desctiption 37 数独
 * @Date 2020/4/13 9:31
 */
public class SolveSudoku {
    private boolean [] [] rowUsed = new boolean[9][10];
    private boolean [] [] colUsed = new boolean[9][10];
    private boolean [] [] cubeUsed = new boolean[9][10];
    private char [][] board;

    public void solveSudoku(char [][] board){
        this.board = board;
        // 遍历一遍，标记已经访问的数
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (board[i][j] == '.'){
                    continue;
                }
                int num = board[i][j] - '0';
                // 第i行num这个数被用了
                rowUsed[i][num] = true;
                colUsed[j][num] = true;
                cubeUsed[cube(i,j)][num] = true;
            }
        }
        tracking(0,0);
    }

    /**
     * 试图填充row，col这个位置的数
     * @param row
     * @param col
     */
    private boolean tracking(int row, int col){
        while (row < 9 && board[row][col] != '.'){
            row = col == 8 ? row + 1 : row;
            col = col == 8 ? 0 : col + 1;
        }
        if (row == 9){
            return true;
        }
        // 从1开始填充一个数
        for (int num = 1; num <= 9; num++){
            if (rowUsed[row][num] || colUsed[col][num] || cubeUsed[(cube(row,col))][num]){
                continue;
            }
            // 标记访问
            rowUsed[row][num] = colUsed[col][num] = cubeUsed[(cube(row,col))][num] = true;
            board[row][col] = (char) (num + '0');
            if (tracking(row, col)){
                return true;
            }
            board[row][col] = '.';
            rowUsed[row][num] = colUsed[col][num] = cubeUsed[(cube(row,col))][num] = false;
        }
        return false;
    }

    /**
     * 计算i,j这个坐标在哪个位置上
     * @param i
     * @param j
     * @return
     */
    private int cube(int i, int j){
        int r = i / 3;
        int c = j / 3;
        return r * 3 + c;
    }

}
