package cn.gdut.jianzhi;

import java.util.Stack;

public class Test31 {

    public boolean IsPopOrder(int [] pushA, int [] popA){
        // 定义一个栈 ，模拟进栈操作
        Stack<Integer> stack = new Stack<>();
        int n = popA.length;
        int k = 0;
        for (int i = 0 ;i < n;i++){
            // 进栈
            stack.push(pushA[i]);
            // 当出栈的数与栈顶元素相同时，出栈
            while (!stack.isEmpty() && k <= n && stack.peek() == popA[k] ){
                stack.pop();
                k++;
            }
        }
        return stack.isEmpty();
    }
}
