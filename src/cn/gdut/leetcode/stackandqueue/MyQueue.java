package cn.gdut.leetcode.stackandqueue;

import java.util.Stack;

/**
 * @ClassName MyQueue
 * @Desctiption TODO
 * @Date 2020/4/2 20:45
 */
public class MyQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        stack1ToStack2();
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        stack1ToStack2();
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void stack1ToStack2(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
    }
}













