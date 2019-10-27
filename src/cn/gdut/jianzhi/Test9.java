package cn.gdut.jianzhi;

import java.util.Stack;

/**
 * 用两个栈实现队列
 */
public class Test9 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node){
        stack1.push(node);
    }

    public int pop(){
        // 栈2不为空，直接出栈
        if (!stack2.isEmpty()){
            return stack2.pop();
        }
        // 否则将栈1的元素都放入到栈2中
        else {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
