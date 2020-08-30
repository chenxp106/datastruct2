package cn.gdut.bishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName T3601
 * @Desctiption TODO
 * @Date 2020/8/22 19:34
 */
public class T3601 {
    /**
     * 5
     * BA
     * aOWVXARgUbJDG
     * OPPCSKNS
     * HFDJEEDA
     * ABBABBBBAABBBAABAAA
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        String str = "";
        for (int i = 0; i < n ;i++){
            str = sc.next();
            list.add(str);
        }
        int len = 0;
        for (String s : list){
            char[] chars = s.toCharArray();
            boolean flag = true;
            if (chars.length > 10){
                flag = false;
            }
            for (int i  = 0;i < chars.length; i++){
                boolean  a = ('a' <= chars[i] && chars[i] <= 'z') || ('A' <= chars[i] && chars[i] <= 'Z');
                if (!a){
                    flag = false;
                    break;
                }
            }
            if (flag){
                len++;
            }
        }
        System.out.println(len++);
    }
}
