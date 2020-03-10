package cn.gdut.leetcode.sousuo.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LetterCombinations
 * @Desctiption TODO
 * @Date 2020/3/10 21:50
 */
public class LetterCombinations {
    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        // 定义返回结果
        List<String> ret = new ArrayList<>();
        // 判空
        if (digits == null || digits.length() == 0){
            return ret;
        }

        doCombination(new StringBuilder(), ret, digits);
        return ret;
    }

    private void doCombination(StringBuilder prefix, List<String> ret, final String digits){
        if(prefix.length() == digits.length()){
            ret.add(prefix.toString());
            return;
        }
        // 取出当前的数字
        int curDigits = digits.charAt(prefix.length()) - '0';
        // 获取当前数字对应的字符串
        String letters = KEYS[curDigits] ;
        // 循环递归当前字符
        for(char c : letters.toCharArray()) {
            // 加入当前字符
            prefix.append(c);
            doCombination(prefix, ret, digits);
            // 删除当前字符
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }

    public static void main(String[] args) {
        LetterCombinations letterCombinations = new LetterCombinations();
        System.out.println(letterCombinations.letterCombinations("23"));
    }
}
