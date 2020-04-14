package cn.gdut.leetcode.tracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName SolveNQueens
 * @Desctiption 51 N皇后
 * @Date 2020/4/13 8:47
 */
public class SolveNQueens {
    private List<List<String>> res;
    char [][] grids;
    boolean [] colUsed;
    boolean [] d45Used;
    boolean [] d135Used;
    private int n ;
    public List<List<String>> solveNQueens(int n){
        res = new ArrayList<>();
        // 构建棋盘
        grids = new char[n][n];
        for (int i = 0; i < n; i++){
            Arrays.fill(grids[i], '.');
        }
        colUsed = new boolean[n];
        d45Used = new boolean[2 * n -1];
        d135Used = new boolean[2 * n - 1];
        this.n = n;
        tracking(0);
        return res;
    }

    /**
     * 尝试在第row行添加一个皇后
     * @param row
     */
    private void tracking(int row){
        // 说明找到了一个，将它添加到结果集中
        if (row == n){
            List<String> list = new ArrayList<>();
            for (char [] c : grids){
                list.add(new String(c));
            }
            res.add(list);
            // 同时返回
            return;
        }

        for (int col = 0; col < n; col++){
            // 如果没有访问
            if (colUsed[col] || d45Used[row + col] || d135Used[n - 1 - (row - col)]){
                continue;
            }
            // 放入一个
            grids[row][col] = 'Q';
            // 置一行和斜边访问过
            colUsed[col] = d45Used[row + col] = d135Used[n - 1 - (row - col)] = true;
            // 递归下一行
            tracking(row + 1);
            colUsed[col] = d45Used[row + col] = d135Used[n - 1 - (row - col)] = false;
            grids[row][col] = '.';
        }
    }

    public static void main(String[] args) {
        System.out.println(new SolveNQueens().solveNQueens(4));
    }
}
















