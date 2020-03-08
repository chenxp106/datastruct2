package cn.gdut.leetcode.shuangzhizhen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * @ClassName ReverseVowels
 * @Desctiption 翻转字符串中的元音字符
 * s = "leetcode", return "leotcede".
 * @Date 2020/3/2 21:06
 */
public class ReverseVowels {

    public final static HashSet<Character> set = new HashSet<>(
            Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')
    );

    public String reverseVowels(String s){
        if (s == null){
            return "";
        }


        int i = 0, j = s.length() - 1;
        char [] result = new char[s.length()];
        while (i <= j){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            // 如果不包含元音字母，往下移动
            if ( !set.contains(ci)){
                result[i++] = ci;
            }
            else if ( !set.contains(cj)){
                result[j--] = cj;
            }
            else {
                result[i++] = cj;
                result[j--] = ci;
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        Hashtable<Object, Object> hashtable = new Hashtable<>();
        hashtable.put("a","a");
        System.out.println(hashtable.get("a"));
    }
}
