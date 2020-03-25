package cn.gdut.leetcode.newcoder;

import java.util.Scanner;

/**
 * @ClassName Test3601
 * @Desctiption TODO
 * @Date 2020/3/24 20:14
 */
public class Test3601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "";
        String s2 = "";
        s1 = sc.nextLine();
        s2 = sc.nextLine();

        // ATTTAA
        // TTAATT
//        int cnt = 0;
//        long n = s1.length();
//        long i = 0;
//        boolean flag = true;
//        while (i < n){
//            if (s1.charAt(i) != s2.charAt(i)){
////                i++;
//                flag = !flag;
//            }
//            if (flag){
//                cnt++;
////                flag = !flag;
//            }
//            i++;
//        }
//        if (!flag){
//            cnt++;
//        }
//        System.out.println(cnt);

        int len = s1.length();
        char [] str1 = s1.toCharArray();
        char [] str2 = s2.toCharArray();
        int cnt = 0;
        for (int i = 0; i < len; i++){
            if (str1[i] == str2[i]){
                continue;
            }
            int j = i + 1;
            while (j < len &&(str1[j] != str2[i] || str1[j] == str2[j])){
                j++;
            }
            if (j < len){
                char tmp = str1[i];
                str1[i] = str1[j];
                str1[j] = tmp;
            }
            else {
                str1[1] = str2[i];
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
