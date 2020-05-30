package cn.gdut.leetcode.arrayfind;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Intersect
 * @Desctiption 350 两个数组的交集 出现的次数可以多次
 * @Date 2020/4/4 9:36
 */
public class Intersect {
    public int [] intersect(int [] nums1, int [] nums2){
//        Map<Integer, Integer> map1 = new HashMap<>();
//        for (int x : nums1){
//            map1.put(x, map1.getOrDefault(x, 0) + 1);
//        }
//
//        Map<Integer, Integer> map2 = new HashMap<>();
//        for (int x : nums2){
//            map2.put(x, map2.getOrDefault(x, 0) + 1);
//        }
//
//        int [] out = new int[nums1.length];
//        int idx = 0;
//        int len = 0;
//        for (Integer key : map1.keySet()){
//            if (map2.containsKey(key)){
//                if (map1.get(key) > map2.get(key)){
//                    len = map2.get(key);
//
//                }
//                else {
//                    len = map1.get(key);
//                }
//                int start = idx;
//                int end = start + len;
//                idx = end;
//                Arrays.fill(out, start, end, key);
//            }
//        }
//        return Arrays.copyOf(out, idx);
        // 构建两个map
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int x :nums1){
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int x :nums2){
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }
        int len = 0;
        int idx = 0;
        int [] array = new int[nums1.length];
        for (int x : map1.keySet()){
            if (map2.containsKey(x)){
                if (map1.get(x) > map2.get(x)){
                    len = map2.get(x);
                }
                else {
                    len = map1.get(x);
                }
                int start = idx;
                int end = idx + len;
                idx = end;
                Arrays.fill(array, start, end, x);
            }
        }
        return Arrays.copyOf(array, idx);
    }

    public static void main(String[] args) {
        int [] a = {1,2,2,1};
        int [] b = {2,2};
        Intersect intersect = new Intersect();
        int [] out = intersect.intersect(a,b);
        for (int x : out){
            System.out.println(x);
        }
    }
}











