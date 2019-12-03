package cn.gdut.jianzhi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Desctiption TODO
 * @Date 2019/12/1/001
 **/
public class Test48 {
    public int longestSubStringWithoutDuplication(String str){
        /*int curLen = 0;
        int maxLen = 0;
        int [] preIndex = new int[26];
        Arrays.fill(preIndex, -1);
        for (int curI = 0; curI < str.length() ;curI++){
            int c = str.charAt(curI) - 'a';
            int preI = preIndex[c];
            if (preI == -1 || curI - preI > curLen){
                curLen++;
            }
            else {
                maxLen = Math.max(maxLen, curLen);
                curLen = curI - preI;
            }
            preIndex[c] = curI;
        }
        maxLen = Math.max(maxLen ,curLen);
        return maxLen;*/


        /*Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        // 记录当前字符前面出现的位置
        int pre = -1;
        for (int i = 0; i < str.length();i++){
            // 获取字符
            Character c = str.charAt(i);
            // 当前字符前一个字符出现的位置
            Integer index = map.get(c);
            // 已经出现过
            if (index != null){
                // 更新位置
                pre = Math.max(pre, index);
            }
            // 比较最大长度
            max = Math.max(max, i - pre);
            // 将当前字符放入map中
            map.put(c, i);
        }

        return max;*/

        // 定义一个map，用于存储当前字符前一个出现的位置
        Map<Character,Integer> map = new HashMap<>();
        // 定义最大长度
        int max = 0;
        // 定义前一个位置
        int pre = -1;
        for (int i = 0; i < str.length();i++){
            // 当前字符
            char c = str.charAt(i);
            Integer index = map.get(c);
            // 之前已经出现了这个字符
            if (index != null){
                // 更新当前子pre为这个
                pre = Math.max(index, pre);
            }
            // 计算当前的最大值
            max = Math.max(max, i - pre);
            // 将当前字符放入map中
            map.put(c,i);
        }
        return max;

    }

    public static void main(String[] args) {
        Test48 test48 = new Test48();
        String str = "arabcacfr";
        System.out.println(test48.longestSubStringWithoutDuplication(str));
    }
}
