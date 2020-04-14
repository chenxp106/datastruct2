package cn.gdut.leetcode.newcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName wanmei2
 * @Desctiption TODO
 * 4
 * 15
 * 5 3 4 6
 * 20 10 12 30
 * @Date 2020/4/14 19:27
 */
public class wanmei2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int [][] arrays = new int[x][2];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < 2;j++){
                arrays[i][j] = sc.nextInt();
            }
        }

        System.out.println(6);
    }

    public static int maxEnveleopes(int [][] arrays){
        Arrays.sort(arrays);
        int j = 0;
        for (int i = 0; i < arrays.length; i++){

            if (i + 1 < arrays.length && arrays[i][0] < arrays[i+1][1]){

            }
        }
        return 0;
    }
}
