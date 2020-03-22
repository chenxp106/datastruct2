package cn.gdut.leetcode.newcoder;

import java.util.Scanner;

/**
 * @ClassName douyu1
 * @Desctiption TODO
 * @Date 2020/3/22 15:56
 */
public class douyu1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }

        /**
         * 多行输入
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, x;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                x = sc.nextInt();
                ans += x;
            }
        }
        System.out.println(ans);

        /**
         *
         */
    }
}
