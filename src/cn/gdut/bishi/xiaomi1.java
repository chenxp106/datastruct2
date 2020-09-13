package cn.gdut.bishi;

import java.util.Scanner;

public class xiaomi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().trim().split(" ");
        for (String str : s){
            char[] chars = str.toCharArray();
            if (chars.length < 8 || chars.length > 120 ){
                System.out.println(1);
                continue;
            }
            int dig = 0;
            int lett = 0;
            int up = 0;
            int low = 0;
            for (char c : chars){
                if (Character.isUpperCase(c)){
                    up++;
                }
                if (Character.isDigit(c)){
                    dig++;
                }
                if (Character.isLowerCase(c)){
                    low++;
                }
                if (Character.isLetter(c)){
                    lett++;
                }
                else {
                    continue;
                }
            }
            if (dig > 0 && lett > 0 && up > 0 && low > 0){
                System.out.println(0);
            }
            else {
                System.out.println(2);
            }
        }
    }
}
