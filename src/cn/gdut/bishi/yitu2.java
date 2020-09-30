package cn.gdut.bishi;

import java.util.Scanner;

public class yitu2 {

    private static int [][] dir = {{1,0},{-1,0}, {0,1}, {0, -1}};
    private static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine().trim());

        for (int i = 0; i < t; i++){
            String[] s = sc.nextLine().trim().split(" ");
            int m = Integer.valueOf(s[0]);
            int n = Integer.valueOf(s[1]);

            String[] s3 = sc.nextLine().trim().split(" ");
            int x = Integer.valueOf(s3[0]);
            int y = Integer.valueOf(s3[1]);

            String[] s1 = sc.nextLine().trim().split(" ");
            int a = Integer.valueOf(s1[0]);
            int b = Integer.valueOf(s1[0]);
            int c = Integer.valueOf(s1[0]);
            int d = Integer.valueOf(s1[0]);

            char [][] arr = new char[m][n];
            for (int j = 0; j < m; j++){
                String s2 = sc.nextLine().trim();
                for (int k = 0; k < n; k++){
                    arr[j][k] = s2.charAt(k);
                }
            }
            min = Integer.MAX_VALUE;
            boolean [][] visit = new boolean[m][n];
            tracking(arr, 0,0, x,y,m, n, a,b,c,d,0,visit);
            System.out.println("Case #"+i+1 + " " + min);

        }
    }

    private static void tracking(char [][] arr, int i, int j, int x, int y, int m,  int n, int a, int b,int c, int d, int cur, boolean [][] visit){
        if ( i >= m || j >= n || i < 0 || j < 0 || visit[i][j]){
            return;
        }
        if (i == x && j == y){
            min = Math.min(cur, min);
            return;
        }

        if (  arr[i][j] == 'o'){

            for (int [] dd : dir){
                int ii = dd[0];
                int jj = dd[1];

                int it = i + ii;
                int jt = j + jj;

                if (ii == 0 && jj == 1){
                    cur += a;
                    visit[i][j] = true;
                    tracking(arr, it, jt, x, y, m, n, a, b, c, d, cur, visit);
                    cur -= a;
                    visit[i][j] =false;

                }
                if (ii == 0 && jj == -1){
                    cur += b;
                    visit[i][j] = true;
                    tracking(arr, it, jt, x, y, m, n, a, b, c, d, cur, visit);
                    cur -= b;
                    visit[i][j] =false;
                }
                if (ii == 1 && jj == 0){
                    cur += c;
                    visit[i][j] = true;
                    tracking(arr, it, jt, x, y, m, n, a, b, c, d, cur, visit);
                    cur -=c ;
                    visit[i][j] =false;
                }
                if (ii == -1 && jj == 0){
                    cur += d;
                    visit[i][j] = true;
                    tracking(arr, it, jt, x, y, m, n, a, b, c, d, cur, visit);
                    cur -= d;
                    visit[i][j] =false;
                }

            }
        }

    }
}




























