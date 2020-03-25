package cn.gdut.leetcode.newcoder;

import java.util.Scanner;

/**
 * @ClassName Test3602
 * @Desctiption TODO
 * @Date 2020/3/24 20:40
 */
public class Test3602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(n / (m +n) + pailie(n, m));
    }

    private static float pailie(int n, int m){
        int mn = m+n;
        long res1 = 1;
        long res2 = 1;
        for (int i = 1; i <= n; i++){
            res1 *= i;
        }
        for (int j = mn; j >= mn - n; j--){
            res2 *= j;
        }
        return (float) res1 / res2;
    }
}
