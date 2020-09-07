package cn.gdut.bishi;

import java.util.*;

public class baidu3 {

    private static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] s1 = s.split(" ");
        // 步数
        int m = Integer.valueOf(s1[0]);
        // 夸数
        int n = Integer.valueOf(s1[1]);
        int a1 = 0;
        int a2 = 0;
        tracking(m, n, a1 ,a2);
        System.out.println(cnt);

    }
    private static void tracking( int m, int n, int a1, int a2){
        if (m < 0){
            return;
        }
        if (m == 0){
            cnt++;
            return;
        }
        for (int i = 1; i <= n; i++){
            if (i == a1 || a2 == i){
                continue;
            }
            a1 = a2;
            a2 = i;
            tracking(m-i, n, a1, a2);
        }
    }
}
