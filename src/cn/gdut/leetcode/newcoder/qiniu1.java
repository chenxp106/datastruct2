package cn.gdut.leetcode.newcoder;

import java.util.*;

/**
 * @ClassName qiniu1
 * @Desctiption TODO
 * @Date 2020/4/28 19:47
 */
public class qiniu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int m = Integer.valueOf(s[0]);
        int n = Integer.valueOf(s[1]);


        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set1 = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++){
            String[] split = sc.nextLine().split(" ");
            map.put(Integer.valueOf(split[0]), Integer.valueOf(split[1]));
            set1.add(Integer.valueOf(split[0]));
            set1.add(Integer.valueOf(split[1]));
            if (queue.size() == 0){
                queue.add(Integer.valueOf(split[0]));
            }
        }
        Set<Integer> set2 = new HashSet<>();
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size-- > 0){
                Integer cur = queue.poll();
                set2.add(cur);
                if (!set2.contains(map.get(cur))){
                    queue.add(map.get(cur));
                }

            }
        }

        if (set1.size() == set2.size()){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
