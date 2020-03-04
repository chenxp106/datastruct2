package cn.gdut.leetcode.shuangzhizhen;

import java.util.List;

/**
 * @ClassName 524 LongestWord
 * @Desctiption s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * Output:  "apple"
 * 求最长公共子序列，可以删除其中的字符。
 * @Date 2020/3/4 9:09
 */
public class LongestWord {

    public String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        // 循环d
        for (String target : d) {
            int l1 = longestWord.length();
            int l2 = target.length();
            // 如果l1的长度大于l2，或是 长度相等的时候，两个字符串不相同，直接跳过
            if ( l1 > l2 || (l1 == l2 && longestWord.compareTo(target) < 0)){
                continue;
            }

            if (isSubstr(s, target)){
                longestWord = target;
            }
        }
        return longestWord;
    }

    // 判断target是否为s的子串
    private boolean isSubstr(String s, String target){
        int i = 0, j = 0;
        while(i < s.length() && j < target.length()){
            if( s.charAt(i) == target.charAt(j)){
                j++;
            }
            i++;
        }
        // 如果j走到了最后
        return j == target.length();
    }

}
