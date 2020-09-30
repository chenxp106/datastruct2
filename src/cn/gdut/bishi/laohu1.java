package cn.gdut.bishi;

import java.util.Comparator;
        import java.util.PriorityQueue;
        import java.util.Scanner;

public class laohu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str3 = sc.nextLine().trim().split(" ");
        int n = Integer.valueOf(str3[0]);
        int w = Integer.valueOf(str3[0]);
        int k = Integer.valueOf(str3[0]);


        String[] str1 = sc.nextLine().trim().split(" ");
        int [] cost = new int[n];
        for (int i = 0; i < n; i++){
            cost[i] = Integer.valueOf(str1[i]);
        }

        String[] str2 = sc.nextLine().trim().split(" ");
        int [] profit = new int[n];
        for (int i = 0; i < n; i++){
            profit[i] = Integer.valueOf(str2[i]);
        }

        System.out.println(getMax(cost, profit, k,w));

    }

    private static int getMax(int [] cost, int [] profit, int k, int w){
        int maxResult = w;
        PriorityQueue<Integer> min = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return cost[o1] - cost[o2];
            }
        });

        PriorityQueue<Integer> max = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return profit[o2] - profit[o1];
            }
        });

        for (int i = 0; i < cost.length; i++){
            min.offer(i);
        }

        while (!min.isEmpty() && cost[min.peek()] <= w){
            max.offer(min.poll());
        }

        for (int i = 0; i < k ; i++){
            int profi = profit[max.poll()];
            maxResult = maxResult + profi;
            w += profi;
            while (!min.isEmpty() &&cost[min.peek()] <= w){
                max.offer(min.poll());
            }
        }
        return maxResult;
    }
}





















