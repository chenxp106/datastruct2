package cn.gdut.bishi;

import java.util.Scanner;

public class jinshanyun1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1){
            System.out.println(1);
        }

        int [] dp = getFib(n);
        for (int i = 1; i <= n; i++){
            for (int j = 1; j < i; j++){
                System.out.print(dp[j-1] + " ");
            }
            System.out.print(dp[i-1] + " ");
            for (int k = i; k > 1; k--){
                System.out.print(dp[k-2] + " ");
            }
            System.out.println();
        }


    }

    private static int [] getFib(int n){
        int [] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp;
    }
}
