package cn.gdut.bishi;

import java.util.*;

public class tengxun3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine().trim());
        int [] arr = new int[n];
        String[] s = sc.nextLine().trim().split(" ");
        for (int i = 0; i < n; i++){
            arr[i] = Integer.valueOf(s[i]);
        }

        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        // 小跟堆
        PriorityQueue<Integer> queue2 = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        int cnt = 0;
        for (int i = 0; i < n; i++){
            //插入元素是。如果是偶数，先进入大根堆，搜选一个将最大的数送到大根堆中
            if (cnt % 2 == 0){
                queue1.add(arr[i]);
                // 大堆出一个数,将出来的数送到小堆中
                queue2.add(queue1.poll());
            }
            // 如果是奇数，则先进小堆，再送到大堆中
            else {
                queue2.add(arr[i]);
                queue1.add(queue2.poll());
            }
            cnt++;
        }


        for (int i = 0; i < n; i++){
            if (queue1.contains(arr[i])){


                if (arr[i] >= queue1.peek()){
                    System.out.println(queue2.peek());
                }
                else {
                    System.out.println(queue1.peek());
                }


            }
            else {
                if (arr[i] >= queue1.peek()){
                    System.out.println(queue2.peek());
                }
                else {
                    System.out.println(queue1.peek());
                }
            }
        }
    }
}
