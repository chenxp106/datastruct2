package cn.gdut.bishi;

import java.util.Scanner;

public class zijie1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine().trim());

        int [][]  dp = new int[n][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 1;
        dp[1][1] = 1;
        for (int i = 2; i < n;i++){
            // 走一步和两部
            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            // 不能同时走两部
            dp[i][1] = dp[i-2][0];
        }
        System.out.println(dp[n-1][1] + dp[n-1][0]);


    }

//    private void tracking(int n, int i, int l1, int l2){
//        if (i > n){
//            return;
//        }
//        if (i == n){
//            cnt++;
//            return;
//        }
//        if (l2 == 2){
//            tracking(n, i+1, l1, l2);
//        }
//        else {
//            tracking(n, i+ 1, l1, l2);
//
//        }
//
//    }

}
