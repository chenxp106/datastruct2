package cn.gdut.bishi;

import java.util.Scanner;

/**
 * 乘机最大
 */
public class dianxin1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0){
            System.out.println(0);
        }

        int [] dp = new int[n+1];

        dp[0] = 1;
        int a1 = 0, a2 = 0, a3 = 0;
        for (int i = 1; i < n; i++){
            int b2 = dp[a1] * 2;
            int b3 = dp[a2] * 3;
            int b5 = dp[a3] * 5;
            int nn = Math.min(b2, Math.min(b3, b5));
            if (nn == b2){
                a1++;
            }

            if (nn == b3){
                a2++;
            }
            if (nn == b5){
                a3++;
            }
            dp[i] = nn;

        }
        System.out.println(dp[n-1]);
    }
}
