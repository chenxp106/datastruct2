package cn.gdut.bishi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class pingan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<String>> lists = solveNQueens(n);
        System.out.println(lists.size());
    }

    static private List<List<String>> res;
    static char [][] grids;
    static boolean [] colUsed;
    static boolean [] d45Used;
    static boolean [] d135Used;

    public static List<List<String>> solveNQueens(int n){
        res = new ArrayList<>();
        // 构建棋盘
        grids = new char[n][n];
        for (int i = 0; i < n; i++){
            Arrays.fill(grids[i], '.');
        }
        colUsed = new boolean[n];
        d45Used = new boolean[2 * n -1];
        d135Used = new boolean[2 * n - 1];

        tracking(0, n);
        return res;
    }

    private static void tracking(int row, int n){
        if (row == n){
            List<String> list = new ArrayList<>();
            for (char [] c : grids){
                list.add(new String(c));
            }
            res.add(list);
            return;
        }

        for (int col = 0; col < n; col++){
            if (colUsed[col] || d45Used[row + col] || d135Used[n - 1 - (row - col)]){
                continue;
            }
            grids[row][col] = 'Q';
            colUsed[col] = d45Used[row + col] = d135Used[n - 1 - (row - col)] = true;
            tracking(row + 1, n);
            colUsed[col] = d45Used[row + col] = d135Used[n - 1 - (row - col)] = false;
            grids[row][col] = '.';
        }
    }

}
