package cn.gdut.jianzhi;

import java.util.Stack;

public class Test30 {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    // 同时进栈
    public void push(int node){
        stack.push(node);
        minStack.push(minStack.isEmpty() ? node : Math.min(node, minStack.peek()));
    }

    /**
     * 同时出栈
     */
    public void pop(){
        minStack.pop();
        stack.pop();
    }

    public int top(){
        return stack.pop();
    }

    public int min(){
        return minStack.peek();
    }
}
