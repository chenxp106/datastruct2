package cn.gdut.leetcode.stackandqueue;

import java.util.Stack;

/**
 * @ClassName EvalRPN
 * @Desctiption TODO
 * @Date 2020/3/31 15:19
 */
public class EvalRPN {
    public int evalRPN(String[] tokens){

        Stack<Integer> stackNum = new Stack<>();
        for (int i = 0; i < tokens.length; i++){
            String cur = tokens[i];
            if ("+".equals(cur)){
                int num1 = stackNum.pop();
                int num2 = stackNum.pop();
                stackNum.push(num1 + num2);
            }
            else if ("-".equals(cur)){
                int num1 = stackNum.pop();
                int num2 = stackNum.pop();
                stackNum.push(num1 - num2);
            }
            else if ("*".equals(cur)){
                int num1 = stackNum.pop();
                int num2 = stackNum.pop();
                stackNum.push(num1 * num2);
            }
            else if ("/".equals(cur)){
                int num1 = stackNum.pop();
                int num2 = stackNum.pop();
                stackNum.push(num1 / num2);
            }
            else {
                stackNum.push(Integer.valueOf(cur));
            }

        }
        return stackNum.pop();
    }
}
