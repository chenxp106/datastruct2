package cn.gdut.leetcode.newcoder;

import java.util.*;

/**
 * @ClassName tengxun4
 * @Desctiption TODO
 * @Date 2020/4/26 20:03
 */
public class tengxun4 {
    public static  Stack<Integer> stack1 = new Stack<Integer>();
    public static  Stack<Integer> stack2 = new Stack<Integer>();

    public static void add(int node) {
        stack1.push(node);
    }

    public static int poll() {
        if (stack2.isEmpty()){
            pull();
        }
        if (stack2.isEmpty()){
            throw new NoSuchElementException();
        }
        return stack2.pop();
    }

    public static int peek(){
        if (stack2.isEmpty()){
            pull();
        }
        return stack2.peek();
    }


    private static void pull(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<String> opt = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            if (s1.length == 2){
                if ("add".equals(s1[0])){
                    add(Integer.valueOf(s1[1]));
                }
            }
            else if ("poll".equals(s1[0])){
                opt.add("poll");
            }
            else if ("peek".equals(s1[0])){
                opt.add("peek");
            }
        }
        for (int i = 0;i < opt.size(); i++){
            if (opt.get(i).equals("poll")){
                poll();
            }
            else {
                System.out.println(peek());
            }
        }
    }
}
