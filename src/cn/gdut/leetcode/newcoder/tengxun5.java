package cn.gdut.leetcode.newcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName tengxun5
 * @Desctiption TODO
 * @Date 2020/4/26 21:12
 */
public class tengxun5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = Integer.parseInt(sc.nextLine().trim());
        List<Integer> res = new ArrayList<>();
        for (int i = 0 ;i < Q; i++){
            // 输入两个数
            String s = sc.nextLine();
            String[] s1 = s.split(" ");

            int x = Integer.valueOf(s1[0]);
            int k = Integer.valueOf(s1[1]);
            int lever = (int) (Math.log(x) / Math.log(2) + 1);
            if (lever <= k){
                res.add(-1);
                continue;
//                System.out.println(-1);
            }
            while (lever > k){
                x = x/ 2;
                lever--;
            }
            res.add(x);
//            System.out.println(x);
        }
        for (int i = 0; i < res.size() ;i ++){
            System.out.println(res.get(i));
        }
    }
}
