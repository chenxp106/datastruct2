package cn.gdut.bishi;

import javafx.util.Pair;


import java.util.*;

/**
 * @ClassName meituan2
 * @Desctiption TODO
 * @Date 2020/8/22 17:09
 */
public class meituan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        int n = Integer.valueOf(s1[0]);
        int m = Integer.valueOf(s1[1]);

        List<int []> list = new ArrayList<>();
        for (int i = 0; i < n;i++){
            String s2 = sc.nextLine();
            String[] s3 = s2.split(" ");
            list.add(new int[]{Integer.valueOf(s3[0]), Integer.valueOf(s3[1])});
        }
        // 创建大根堆
        PriorityQueue<Pair<Integer, Integer>> small = new PriorityQueue<>((o1, o2)->o1.getKey().compareTo(o2.getKey()));
        PriorityQueue<Pair<Integer, Integer>> big = new PriorityQueue<>((o1, o2)->o2.getKey().compareTo(o1.getKey()));

        for (int i = 0; i < list.size(); i++){
            int total = list.get(i)[0] + list.get(i)[1] * 2;
            if (small.size() > m){
                small.remove();
            }
            small.add(new Pair<>(total, i+1));
        }
        int size = small.size();
        for (int i = 0; i < size; i++){
            big.add(small.poll());
        }
        int [] a = new int[m];

        for (int i = 0; i < m; i++){
            Pair<Integer, Integer> poll = big.poll();
            a[i] = poll.getValue();
        }
        Arrays.sort(a);
        for (int i = 0; i < m; i++){
            System.out.print(a[i]);
            if (i != m - 1){
                System.out.print(" ");
            }
        }
    }
}
