package cn.gdut.leetcode.arrayfind;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Intersection
 * @Desctiption 349 两个数组的交集，重复的只算一个
 * @Date 2020/4/4 9:24
 */
public class Intersection {
    public int [] intersection(int [] nums1, int [] nums2){
//        // 使用两个set
//        Set<Integer> set1 = new HashSet<>();
//        for (int n : nums1){
//            set1.add(n);
//        }
//        Set<Integer> set2 = new HashSet<>();
//        for (int n : nums2){
//            set2.add(n);
//        }
//        if (set1.size() < set2.size()){
//            return find(set1, set2);
//        }
//        else {
//            return find(set2, set1);
//        }
        // 用set
        Set<Integer> set1 = new HashSet<>();
        for (int x : nums1){
            set1.add(x);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int x : nums2){
            set2.add(x);
        }
        if (set1.size() < set2.size()){
            return find(set1, set2);
        }
        else {
            return find(set2, set1);
        }
    }

//    private int [] find(Set<Integer> set1, Set<Integer> set2){
//        int [] output = new int[set1.size()];
//        // 标记重复的个数
//        int idx = 0;
//        for (Integer x : set1){
//            if (set2.contains(x)){
//                output[idx++] = x;
//            }
//        }
//        return Arrays.copyOf(output,idx);
//    }
    private int [] find(Set<Integer> set1, Set<Integer> set2){
        int [] out = new int[set1.size()];
        // 标记重复的个数
        int idx = 0;
        for (Integer x : set1){
            if (set2.contains(x)){
                out[idx++] = x;
            }
        }
        return Arrays.copyOf(out, idx);
    }
}


















