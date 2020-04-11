package cn.gdut.leetcode.tracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LetterCombinations
 * @Desctiption 17 数字键盘组合
 * @Date 2020/4/10 9:36
 */
public class LetterCombinations {

    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits){
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0){
            return res;
        }
        tracking(res, new StringBuilder(), digits);
        return res;
    }

    /**
     * 每次加入一个字符
     * @param res
     * @param prefix
     * @param digits
     */
    private void tracking(List<String> res, StringBuilder prefix, String digits){
        if (prefix.length() == digits.length()){
            res.add(prefix.toString());
            return;
        }

        // 取出当前需要加入的整数
        int curNum = digits.charAt(prefix.length()) - '0';
        // 取出字符数组
        String chars = KEYS[curNum];
        for (char c : chars.toCharArray()){
            // 将当前字符加入
            prefix.append(c);
            tracking(res, prefix, digits);
            prefix.deleteCharAt(prefix.length());
        }

    }

    /*private void tracking(StringBuilder prefix, List<String> res, String digits){
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
    }*/


}












