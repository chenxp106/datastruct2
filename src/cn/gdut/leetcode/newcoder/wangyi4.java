package cn.gdut.leetcode.newcoder;

import java.util.Scanner;

/**
 * @ClassName wangyi4
 * @Desctiption TODO
 * @Date 2020/4/7 19:47
 */
public class wangyi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = null;
        while (sc.hasNext()){
            String s = sc.nextLine();
            String [] str = s.split(" ");
            a = new int[str.length];
            for (int i = 0; i < str.length; i++){
                a[i] = Integer.valueOf(str[i]);
                System.out.print(a[i] + " ");
            }
        }
        int m = a[0];
        int n = a[1];
        int [][] nums = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                nums[i][j] = sc.nextInt();
                System.out.println(nums[i][j]);
            }
        }
    }
}
