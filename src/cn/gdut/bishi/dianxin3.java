package cn.gdut.bishi;

import java.util.Scanner;
import java.util.Stack;


/**
 * 7
 * push -2
 * push 0
 * push -3
 * getMin
 * pop
 * top
 * getMin
 */
public class dianxin3 {

    static Stack<Integer> data = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(sc.nextLine().trim());
        for (int i = 0; i < n; i++){
            String str = sc.nextLine().trim();
            if (str.startsWith("push")){
                String[] s = str.split(" ");
                push(Integer.valueOf(s[1]));
            }

            else if (str.startsWith("getMin")){
                System.out.println(min());
            }
            else if (str.startsWith("pop")){
                pop();
            }
            else if (str.startsWith("top")){
                System.out.println(top());
            }
        }

    }

    // 进栈
    public static void push(int node){
        data.push(node);
        if (minStack.isEmpty()){
            minStack.push(node);
        }
        else {
            minStack.push(minStack.peek() < node ? minStack.peek() : node);
        }
    }

    // 出站
    public static void pop(){
        data.pop();
        minStack.pop();
    }

    // 获取栈顶元素
    public static int top(){
        return data.peek();
    }

    // 获取最小元素
    public static int min(){
        return minStack.peek();
    }


}
