package cn.gdut.leetcode.newcoder;

import java.util.Scanner;

/**
 * @ClassName kuais11
 * @Desctiption TODO
 * @Date 2020/4/12 16:21
 */
public class kuais11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            char[] chars = sc.nextLine().toCharArray();
            int ok = 0;
            int left1 = 0;
            int right1 = 0;
            int left2 = 0;
            int right2 = 0;
            for (int i = chars.length - 1; i >= 0; i--){
                if (chars[i] == '('){
                    if (left1 == 0){
                        left1++;
                    }
                    else {
                        right1--;
                        ok++;
                    }
                }
                else if (chars[i] == ')'){
                    right1++;
                }

                else if (chars[i] == '['){
                    if (left2 == 0){
                        left2++;
                    }
                    else {
                        right2--;
                        ok++;
                    }
                }
                else if (chars[i] == ']'){
                    right2++;
                }
            }
            System.out.println(ok + " " + (left1 + left2)  + " " + (right1 + right2));
        }

    }
}
