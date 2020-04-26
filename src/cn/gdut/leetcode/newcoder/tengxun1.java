package cn.gdut.leetcode.newcoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName tengxun1
 * @Desctiption TODO
 * @Date 2020/4/26 20:59
 */
public class tengxun1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++){
            int group = Integer.parseInt(sc.nextLine().trim());
            List<Integer> queue = new LinkedList<>();
            for (int j = 0; j< group; j++){

                String s1 = sc.nextLine();
                String[] s = s1.split(" ");
                if (s.length == 2){
                    if ("PUSH".equals(s[0])){
                        queue.add(Integer.valueOf(s[1]));
                    }

                }
                else if ("POP".equals(Integer.valueOf(s[0])) && queue.size() > 0){
                    System.out.println(((LinkedList<Integer>) queue).pop());
                }
                else if ("POP".equals(Integer.valueOf(s[0])) && queue.size() == 0){
                    System.out.println(-1);
                    continue;
                }
                else if ("SIZE".equals(Integer.valueOf(s[0]))){
                    System.out.println(queue.size());
                }
                else if ("TOP".equals(Integer.valueOf(s[0]))){
                    System.out.println(((LinkedList<Integer>) queue).peek());
                }
                else if ("CLEAR".equals(s[0])){
                    while (!queue.isEmpty()){
                        ((LinkedList<Integer>) queue).poll();
                    }
                }
            }
        }
    }
}
