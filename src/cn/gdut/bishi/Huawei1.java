package cn.gdut.bishi;

import java.util.Scanner;

public class Huawei1 {

    public static void main(String[] args) {
        int [][] dir = {{0,1}, {0,-1}, {-1,0},{1,0}};
        Scanner sc = new Scanner(System.in);
        String nm = sc.nextLine();
        String[] split = nm.split(",");
        int m = Integer.valueOf(split[0]);
        int n = Integer.valueOf(split[1]);
        if (m == 0 || n == 0){
            System.out.println(0);
        }
        char [][] grid = new char[m][n];

        for (int i = 0; i < m; i ++){
            String lineStr = sc.nextLine();
            char[] chars = lineStr.toCharArray();
            for (int j = 0; j < n; j++){
                grid[i][j] = chars[j];
            }
        }

        // 个数
        int cnt = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] != 'H'){
                    dfs(grid, i, j, m, n, dir);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    // 深度
    private static void dfs(char [][] grid, int i, int j, int m, int n, int [][] dir){
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 'H'){
            return;
        }
        grid[i][j] = 'H';
        for (int d [] : dir){
            dfs(grid, i + d[0], j+d[1], m,n, dir);
        }
    }

}
