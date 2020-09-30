package cn.gdut.bishi;

import java.util.*;

public class rong360 {
    public static void main(String[] args) {
        int [] a = {2,5,6,3,2,5,1,2,3,2,5,1,2,3,5,1,2,5,2,3};
        Set<Integer> set = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : a){
            map.put(x, map.getOrDefault(x, 1) + 1);
            set.add(x);
        }

        Iterator iteratot = set.iterator();
        int index = 0;
        while (iteratot.hasNext()){
            Integer cur = (Integer) iteratot.next();
            Integer cnt = map.get(cur);
            while (cnt > 0){
                a[index++] =  cur;
                cnt--;
            }

        }
        for (int x : a){
            System.out.println(x);
        }

    }
}
