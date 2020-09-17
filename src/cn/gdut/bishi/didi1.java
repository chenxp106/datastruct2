package cn.gdut.bishi;

import java.util.Scanner;

public class didi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        char[] chars = sc.nextLine().trim().toCharArray();
        if (n >= chars.length){
            reverse(chars, 0, chars.length-1);
        }
        else {
            int i = 0;
            while (i < chars.length - n + 1){
                reverse(chars, i, i + n - 1);
                i += n;
            }
        }

        String res = "";
        for (char c : chars){
            res += c;
        }
        System.out.println(res);
    }

    private static void reverse(char [] str, int i, int j){
        while (i < j){
            char t = str[i];
            str[i] = str[j];
            str[j] = t;
            i++;
            j--;
        }
    }
}
