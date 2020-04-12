package cn.gdut.leetcode.newcoder;

import java.util.*;

/**
 * @ClassName kuaishou1
 * @Desctiption TODO
 * @Date 2020/4/12 16:07
 */
public class kuaishou1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        int left = 0;
        int right = 0;
        int ok = 0;
        Map<Character,Character> map = new HashMap<>();
        map.put('(', null);
        map.put(')', null);
        map.put('[', null);
        map.put(']', null);
        StringBuilder builder = new StringBuilder();
        for (int i  = 0; i < chars.length; i++){
            if (map.containsKey(chars[i])){
                builder.append(chars[i]);
            }
            else {
                continue;
            }
        }

        String s = builder.toString();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else {


                if (s.charAt(i) == ')' && !stack.isEmpty()){
                    Character cur = stack.pop();
                    if (cur == '('){
                        ok++;

                    }
                    else {
                        right++;
                    }

                }
                else if (s.charAt(i) == ']' && !stack.isEmpty()){
                    Character cur = stack.pop();
                    if (cur == '['){
                        ok++;

                    }
                    else {
                        right++;
                    }

                }
                else {
                    right++;
                }
            }


        }
        while (!stack.isEmpty()){
            stack.pop();
            left++;
        }
        System.out.println(ok + " " + left + " " + right);


    }
}
