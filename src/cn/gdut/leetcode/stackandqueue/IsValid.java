package cn.gdut.leetcode.stackandqueue;

import java.util.Stack;

/**
 * @ClassName IsValid
 * @Desctiption TODO
 * @Date 2020/3/31 15:01
 */
public class IsValid {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if (cur == '(' || cur == '{' || cur == '['){
                stack.push(cur);
            }
            else {
                if (stack.size() == 0){
                    return false;
                }
                Character pop = stack.pop();
                char match;
                if ( cur == ')'){
                    match = '(';
                }
                else if (cur == '}'){
                    match = '{';
                }
                else {
                    match = '[';
                }
                if (match != pop){
                    return false;
                }

            }
        }
        if (stack.size() == 0){
            return true;
        }
        else {
            return false;
        }


    }
}















