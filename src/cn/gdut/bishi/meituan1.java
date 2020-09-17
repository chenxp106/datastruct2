package cn.gdut.bishi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class meituan1 {

    private static Set<String> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().trim().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int d = Integer.parseInt(s[2]);
        StringBuilder builder = new StringBuilder();
        tracking(n, k, d, builder);
        System.out.println(set.size());
    }

    private static void tracking( int n, int k, int d, StringBuilder builder){
        if (n < 0){
            return;
        }
        if (n == 0){
            String s = builder.toString();
            char[] chars = s.toCharArray();
            boolean flag = false;
            for (char c : chars){
                if (Integer.valueOf(String.valueOf(c)) >= d){
                    flag = true;
                }
            }
            if (flag){
                set.add(builder.toString());
            }
            builder = new StringBuilder();
            return;
        }

        for (int i  = 1; i <= k; i++){
            builder.append(i);
            tracking(n-i, k, d,builder);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
