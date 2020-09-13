package cn.gdut.bishi;

import java.util.Scanner;

public class huawei4 {

    private static int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private static int  cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] s =  sc.nextLine().trim().split(" ");
        int m = Integer.valueOf(s[0]);
        int n = Integer.valueOf(s[1]);

        int [][] arr = new int[m][n];
        for (int i = 0; i < m; i++){
            String[] s1 = sc.nextLine().trim().split(" ");
            for (int j = 0; j < n; j++){
                arr[i][j] = Integer.valueOf(s1[j]);
            }
        }
        int c = 0;

        boolean[][] visit = new boolean[m][n];
        dfs(0,0, m,n, visit, 0, arr);
        System.out.println(cnt);


    }

    private static void dfs(int r, int c, int m, int n, boolean[][] vist, int cc, int [][] arr) {
        if (r < 0 || r >= m || c < 0 || r >= n || vist[r][c]){
            cnt = Math.max(cc, cnt);
            return;
        }
        cc++;
        vist[r][c] = true;
        for (int[] d : direction) {
            int nextR = d[0] + r;
            int nextC = d[1] + c;
            if (nextR < 0 || nextR >= m || nextC < 0 || nextC >= n || arr[r][c] < arr[nextR][nextC]) {
                continue;
            }
            dfs(nextR, nextC, m,n, vist, cc, arr);
            vist[r][c] = false;
            c--;
        }
    }
}
