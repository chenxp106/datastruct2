package cn.gdut.leetcode.arrayfind;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @ClassName FrequencySort
 * @Desctiption 451 根据字符串出现的频率排序
 * @Date 2020/4/4 11:12
 */
public class FrequencySort {
    public String frequencySort(String s){
//        if (s == null){
//            return "";
//        }
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++){
//            char curChar = s.charAt(i);
//            map.put(curChar, map.getOrDefault(curChar, 0) + 1);
//        }
//
//        // 用大根堆
//        PriorityQueue<Character> heap = new PriorityQueue<>((o1, o2) -> map.get(o2) - map.get(o1));
//        // 入大根堆
//        for (Character key : map.keySet()){
//            heap.add(key);
//        }
//
//        // 重新组装数组
//        StringBuilder builder = new StringBuilder();
//        while (!heap.isEmpty()){
//            // 从堆中出一个
//            Character remove = heap.remove();
//            Integer count = map.get(remove);
//            while (count > 0){
//                builder.append(remove);
//                count--;
//            }
//        }
//        return builder.toString();
        if (s == null ){
            return "";
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            // 获取当前字符
            char curChr = s.charAt(i);
            map.put(curChr,map.getOrDefault(curChr, 0) + 1);
        }
        // 大根堆
        PriorityQueue<Character> queue = new PriorityQueue<>((o1, o2) -> map.get(o2) - map.get(o1));
        // 如大根堆
        for (Character character : map.keySet()){
            queue.add(character);
        }
        // 重组
        StringBuilder builder = new StringBuilder();
        // 出堆
        while (!queue.isEmpty()){
            Character curChr = queue.poll();
            Integer count = map.get(curChr);
            while (count > 0){
                builder.append(curChr);
                count--;
            }
        }
        return builder.toString();

    }

    public static void main(String[] args) {
        FrequencySort frequencySort = new FrequencySort();
        System.out.println(frequencySort.frequencySort("tree"));
    }
}



















