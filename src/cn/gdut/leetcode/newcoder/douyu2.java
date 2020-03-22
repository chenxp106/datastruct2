package cn.gdut.leetcode.newcoder;

import java.util.Arrays;

/**
 * @ClassName douyu2
 * @Desctiption TODO
 * @Date 2020/3/22 17:03
 */
public class douyu2 {
    public static void main(String[] args) {
        String str = "Douyu";
        douyu2 douyu2 = new douyu2();
        String res = douyu2.reverse(str);
        System.out.println(res);
//        System.out.println(douyu2.reverse(str));

    }
    public String reverse (String str) {
        // write code here
        char[] chars = str.toCharArray();
//        String reverse = "";
//        for (int i = chars.length - 1; i >= 0; i--){
//            reverse += chars[i];
//        }
//        return reverse;

        int n = chars.length - 1;
        int i = 0;
        while (i < n){
            char temp = chars[i];
            chars[i] = chars[n];
            chars[n] = temp;
            i++;
            n--;
        }
        return String.valueOf(chars);
    }

//    public String reverse(String str){
//        if (str == null || str.length() == 0){
//            return "";
//        }
//        int n = str.length();
//    }

    private String reserseChar(char [] str){
        int n = str.length - 1;
        int i = 0;
        while (i < n){
            char temp = str[i];
            str[i] = str[n];
            str[n] = temp;
            i++;
            n--;
        }
        return str.toString();
    }
}
