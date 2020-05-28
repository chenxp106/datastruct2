package cn.gdut.leetcode.arrayfind;

import sun.reflect.generics.tree.Tree;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @ClassName ContainsNearbyDuplicate
 * @Desctiption 219 存在重复元素
 * @Date 2020/4/5 12:20
 */
public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int [] nums, int k){
//        // 通过滑动窗口实现
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++){
//            if (set.contains(nums[i])){
//                return true;
//            }
//            set.add(nums[i]);
//            // 删除左边界
//            if (set.size() > k){
//                set.remove(nums[i-k]);
//            }
//        }
//        return false;
        // 通过滑动窗口实现
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str= "avc";
        while (true){
            str += str + new Random().nextInt(88888888) + new Random().nextInt(99999999);
        }
    }
}






