package cn.gdut.bishi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
删除出现次数最小的字符

abcddd

ddd
 */

public class dianxin2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();

        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        // 遍历字符，存储每个字符出现的次数
        for (Character c : chars){
            map.put(c, map.getOrDefault(c, 1) + 1);

        }
        // 获取最少出现的次数
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> map1 : map.entrySet()){
            min = Math.min(min, map1.getValue());
        }


        // 删除最少出现的字符
        String res = "";
        for (Character c : chars){
            if (map.get(c) == min){
                continue;
            }
            else {
                res += c;
            }
        }

        System.out.println(res);
    }
}
