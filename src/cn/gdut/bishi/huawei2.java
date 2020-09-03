package cn.gdut.bishi;

import java.util.Scanner;

public class huawei2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        int K = Integer.valueOf(k.trim());
        int N = Integer.valueOf(sc.nextLine().trim());
        int [] weight = new int[N];
        int [] values = new int[N];
        String strWeight = sc.nextLine();
        String[] s = strWeight.trim().split(" ");
        for (int i = 0; i < N; i++){
            weight[i] = Integer.valueOf(s[i]);
        }
        String strValue = sc.nextLine();
        String[] s1 = strValue.trim().split(" ");
        for (int i = 0; i < N; i++){
            values[i] = Integer.valueOf(s1[i]);
        }

        // 动态规划
        int [][] dp = new int[N+1][K+1];
        // 赋初值
        for (int i = 0; i <= N; i++){
            dp[i][0] = 0;
        }
        for (int j = 0; j <= K; j++){
            dp[0][j] = 0;
        }

        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= K; j++){
                if (j < weight[i-1]){
                    dp[i][j] = dp[i-1][j];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i-1]] + values[i-1]);
                }
            }
        }

        System.out.println(dp[N][K]);
    }

}
