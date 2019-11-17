package cn.gdut.jianzhi;

import java.util.Stack;

public class Test31 {

    public boolean IsPopOrder(int [] pushA, int [] popA){
        int n = pushA.length;
        // 定义一个栈，模拟进栈操作
        Stack<Integer> stack = new Stack<>();
        int k = 0;
        // 依次进栈
        for (int i = 0;i < n;i++){
            stack.push(pushA[i]);
            // 对比出栈,栈不为空，并且值相等，则出栈
            while (!stack.isEmpty() && popA[k] == stack.peek() ){
                stack.pop();
                k++;
            }
        }
        return stack.isEmpty();
    }
}
