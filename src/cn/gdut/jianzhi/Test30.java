package cn.gdut.jianzhi;

import java.util.Stack;

public class Test30 {

    // 用两个栈来实现
    Stack<Integer> data = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    // 同时进栈
    public void push(int node){
        data.push(node);
        if (minStack.isEmpty()){
            minStack.push(node);
        }
        else {
            minStack.push(minStack.peek() < node ? minStack.peek() : node);
        }

    }

    /**
     * 同时出栈
     */
    public void pop(){
        data.pop();
        minStack.pop();
    }

    public int top(){
        return data.peek();
    }

    public int min(){
        return minStack.peek();
    }
}
