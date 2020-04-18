package cn.gdut.leetcode.newcoder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @ClassName jingdong1
 * @Desctiption TODO
 * @Date 2020/4/18 19:22
 */
public class jingdong1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int k = 0; k < t; k++){
            int [][] a = new int[6][2];
            for (int i = 0; i < 6 ; i++){
                for (int j = 0; j < 2;j++){
                    a[i][j] = in.nextInt();
                }
            }
            Arrays.sort(a, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0]==o2[0]) return o1[1]-o2[1];
                    return o1[0]-o2[0];
                }
            });

            boolean x = a[0][0] == a[ 1][0] &&
                    a[3][1] == a[4][1] &&
                    a[0][0] == a[4][1];
            boolean y = a[0][1] == a[1][1] &&
                    a[2][0] ==  a[5][1] &&
                    a[0][1] ==  a[5][1];
            boolean z = a[2][1] == a[3][0] &&
                    a[4][0] ==  a[ 5][0] &&
                    a[2][1] ==  a[4][0];
            if (x && y && z ){
                System.out.println("POSSIBLE");
            }
            else {
                System.out.println("IMPOSSIBLE");
            }

        }
        

    }


}

















