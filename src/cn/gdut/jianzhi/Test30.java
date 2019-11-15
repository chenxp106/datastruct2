package cn.gdut.jianzhi;

import java.util.Stack;

public class Test30 {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int node){
        stack.push(node);
        // 判断是否更小
        minStack.push(minStack.isEmpty() ? node : Math.min(node, minStack.peek()));
    }

    /**
     * 同时出栈
     */
    public void pop(){
        stack.pop();
        minStack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int min(){
        return minStack.peek();
    }
}
