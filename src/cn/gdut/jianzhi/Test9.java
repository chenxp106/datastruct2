package cn.gdut.jianzhi;

import java.util.Stack;

/**
 * 用两个栈实现队列
 */
public class Test9 {
    // 定义两个栈
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node){
       stack1.push(node);
    }

    public int pop(){

        // 出队列。如果不为空，则直接出，否则，将statck1中的元素全部放入到stack2中
        if (!stack2.isEmpty()){
            return stack2.pop();
        }
        // 否则
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
