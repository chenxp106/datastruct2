package cn.gdut.leetcode.tanxin;

import java.util.Scanner;

/**
 * @ClassName Main1
 * @Desctiption TODO
 * @Date 2020/3/13 9:05
 */
public class Main1 {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char [][] grid = new char[2][n];
        for(int i = 0; i < 2; i++){
            grid[i] = s.next().toCharArray();
        }
        for(int i = 0; i < 2; i++){
            for(int j= 0; j < n; j++){
                System.out.print(grid[i][j]);
            }
        }
        // 当你=1时
        if (n == 1){
            if (grid[0][0] == '.' && grid[1][0] == '.'){
                System.out.print(1);
            }
            else {
                System.out.print(-1);
            }
        }
        // 否则
        else {
            int cnt = 1;
            for(int col = n -1; col >= 0; col--){
                if(grid[0][col] == '.' && grid[1][col] == '.'){
                    cnt = cnt * 2;
                }
                else if (grid[0][col] == 'X' && grid[1][col] == 'X'){
                    cnt = -1;
                    break;
                }
            }
            if (cnt == 1 || grid[0][0] == 'X'){
                System.out.println(-1);
            }
            else {
                System.out.println(cnt);
            }
        }

//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        char[][] map = new char[2][n];
//        for (int row = 0;row < 2;row++) {
//            map[row]= input.next().toCharArray();
//        }
//        if (n == 1) {
//            if (map[0][0] == '.' && map[1][0] == '.')
//                System.out.println(1);
//            else
//                System.out.println(-1);
//        }  else {
//            int cnt = 0;
//            boolean flag = true;
//            for (int col = n - 1;col >= 1;col--) {
//                if (map[0][col] == '.' && map[1][col] == '.')
//                    cnt += 2;
//                else if(map[0][col] == 'X' && map[1][col] == 'X') {
//                    cnt = -1;
//                    break;
//                }
//            }
//            if (cnt == 0 || map[0][0] == 'X')
//                System.out.println(-1);
//            else
//                System.out.println(cnt);
//        }
    }
}
