package cn.gdut.leetcode.newcoder;

import java.util.Scanner;

/**
 * @ClassName ali
 * @Desctiption TODO
 * @Date 2020/3/23 18:54
 */
public class ali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        long res = 0;
        long [] dp = new long[in / 2 +2];
        for (int i = 1; i <= in ; i++){
            int minNum = Math.min(i, in - i);
            if (dp[minNum] == 0){
                long c = pailie(in, minNum);
                dp[minNum] = c;
            }
            res += i * dp[minNum];
        }
        System.out.println(res);
    }


    /**
     * 排列
     * @param n
     * @param m
     * @return
     */
    private static long pailie(int n, int m){
        m = Math.min(m, n-m);
        long res = 1;
        for (int i = 1; i<=m; i++){
            res *= n - i +1;
            res /= i;
        }
        return res;

    }
}

