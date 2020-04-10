package cn.gdut.leetcode.tracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LetterCombinations
 * @Desctiption TODO
 * @Date 2020/4/10 9:36
 */
public class LetterCombinations {

    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits){
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0){
            return res;
        }
        tracking(new StringBuilder(), res, digits);
        return res;
    }

    private void tracking(StringBuilder prefix, List<String> res, String digits){
        // 出口
        if (prefix.length() == digits.length()){
            res.add(prefix.toString());
            return;
        }
        // 否则，取出一个整数
        int curDigits = digits.charAt(prefix.length()) - '0';
        // 取出数字对应的字符串
        String letters = KEYS[curDigits];
        // 循环当前字符串
        for (char c : letters.toCharArray()){
            // 加入当前字符
            prefix.append(c);
            // 递归
            tracking(prefix, res, digits);
            // 删除最后一个字符
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }
}












