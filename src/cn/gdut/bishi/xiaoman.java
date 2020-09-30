package cn.gdut.bishi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class xiaoman {
    private static boolean flag = true;
    private static List<Integer> list = new ArrayList<>();
    private static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());


        String[] str = sc.nextLine().trim().split(" ");
        int m = Integer.valueOf(str[0]);
        int n = Integer.valueOf(str[1]);

        char [][] arr = new char[m][n];
        int fi = 0;
        int fj = 0;
        for (int i = 0; i < m; i++){
            String str3 = sc.nextLine().trim();
            for (int j = 0; j < n; j++){
                if (str3.charAt(j) == '@'){
                    fi = i;
                    fj = j;

                }
                arr[i][j] = str3.charAt(j);
            }
        }

        for (int i = 0; i < t; i++){
            flag = false;
            tracking(arr, fi, fj, m, n, 0);
        }
        System.out.println(Collections.min(list));

    }

    public static void tracking(char [][] arr, int i, int j, int m, int n, int cur){
        if (arr[i][j] == '#'){
            return;
        }
        if (i == m - 1 || i == 0 || j == n - 1 || j == 0){
            list.add(cur);
            return;
        }

        for (int[] d : dir) {
            int ii = i  + d[0];
            int jj = j  + d[1];
            if (arr[ii][jj] == '.'){
                tracking(arr, i + d[0], j + d[1], m, n, cur);
            }
            else if (arr[ii][jj] == '*'){
                flag = true;
                cur+=1;
                for (int[] dd : dir) {
                    tracking(arr, i + dd[0], j + dd[1], m, n, cur);
                    cur -= 1;
                }
            }
        }

    }
}
