package cn.gdut.jianzhi;

/**
 * @Desctiption 礼物的最大价值
 *
 * @Date 2019/11/30/030
 **/
public class Test47 {
    public int getMost(int [][] board){
        if (board == null || board[0].length == 0){
            return 0;
        }
        int rows = board.length;
        int clows = board[0].length;
        // 动态规划，二维数组
        int [][] gift = new int[rows][clows];
        gift[0][0] = board[0][0];
        // 第一行和第一列为原来的值
        for (int i = 1 ; i < clows;i++){
            gift[0][i] = gift[0][i-1]+board[0][i];
        }
        for (int j = 1;j < rows; j++){
            gift[j][0] = gift[j-1][0] + board[j][0];
        }
        for (int i = 1;i < rows;i++){
            for (int j = 1; j < clows ;j++){
                gift[i][j] = Math.max((gift[i-1][j]),gift[i][j-1]) + board[i][j];
            }
        }
        return gift[rows-1][clows-1];
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
