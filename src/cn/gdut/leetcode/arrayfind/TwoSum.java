package cn.gdut.leetcode.arrayfind;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TwoSum
 * @Desctiption TODO
 * @Date 2020/4/5 10:15
 */
public class TwoSum {
    public int [] twoSum(int [] nums, int target){
//        // 用map存储，数和下标
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++){
//            map.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++){
//            int complement = target - nums[i];
//            if (map.containsKey(complement) && map.get(complement) != i){
//                return new int [] {i, map.get(complement)};
//            }
//        }
//        return null;
        // 一次遍历hash表
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++){
//            int complement = target - nums[i];
//            if (map.containsKey(complement) ){
//                return new int[] {map.get(complement),i};
//            }
//            map.put(nums[i], i);
//        }
//        throw new IllegalArgumentException("no two sum");

        // 一次hash表
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int com = target - nums[i];
            if (map.containsKey(com)){
                return new int[]  {map.get(com), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no two sum");
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int [] a = {3,2,4};
        System.out.println(twoSum.twoSum(a, 6));
    }
}
