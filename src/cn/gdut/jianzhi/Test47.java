package cn.gdut.jianzhi;

/**
 * @Desctiption 礼物的最大价值
 *
 * @Date 2019/11/30/030
 **/
public class Test47 {
    public int getMost(int [][] board){
        if (board == null || board.length == 0 || board[0].length == 0){
            return 0;
        }
        int row = board.length;
        int col = board[0].length;
        int [][] dp = new int[row][col];
        dp[0][0] = board[0][0];
        // 填充第一行
        for (int i = 1; i < col; i++){
            dp[0][i] = board[0][i] + dp[0][i-1];
        }
        // 填充第一列
        for (int j = 1; j < row; j++){
            dp[j][0] = board[j][0] + dp[j-1][0];
        }
        for (int i = 1;i < row; i++){
            for (int j = 1; j < col; j++){
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + board[i][j];
            }
        }
        return dp[row-1][col-1];
    }

    public static void main(String[] args) {
        Test47 test47 = new Test47();
        int [][] boart = {  {1,10,3,8},
                            {12,2,9,6},
                            {5,7,4,11},
                            {3,7,16,5}
                                };
        System.out.println(test47.getMost(boart));

    }

}
