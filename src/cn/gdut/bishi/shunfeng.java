package cn.gdut.bishi;

import java.util.Scanner;
import java.util.Stack;

public class shunfeng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        Stack<Character> stack = new Stack<>();
        char [] chars = str.toCharArray();
        for (Character c : chars){
            if (c != '<'){
                stack.push(c);
            }
            else if (!stack.isEmpty()){
                stack.pop();
            }

        }

        String res = "";
        while (!stack.isEmpty()){

            char pop = stack.pop();
            res = pop + res;
        }
        System.out.println(res);
    }
}
