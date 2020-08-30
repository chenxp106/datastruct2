package cn.gdut.bishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Meitaun1
 * @Desctiption TODO
 * @Date 2020/8/22 16:06
 */
public class Meitaun1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        String str = "";
        for (int i = 0; i < n ;i++){
            str = sc.next();
            list.add(str);
        }
        for (String s : list){
            boolean flag = true;
            int letter = 0;
            int ch = 0;
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++){
                boolean  a = ('a' <= chars[i] && chars[i] <= 'z') || ('A' <= chars[i] && chars[i] <= 'Z');
                if ((i == 0) && !a){
                    flag = false;
                    break;

                }
                if (Character.isLetter(chars[i])){
                    letter++;
                }
                else if (Character.isDigit(chars[i])){
                    ch++;
                }
                else {
                    flag = false;
                    break;
                }
            }
            if (letter >= 1 && ch >= 1 && flag){
                System.out.println("Accept");
            }
            else {
                System.out.println("Wrong");
            }

        }
    }
}
