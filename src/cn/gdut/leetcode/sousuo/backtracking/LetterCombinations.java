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
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0){
            return result;
        }
        doCombination(new StringBuilder(), result, digits);
        return result;
    }

    /**
     * 回溯
     * @param prefix
     * @param ret
     * @param digits
     */
    private void doCombination(StringBuilder prefix, List<String> ret, final String digits){

        if (prefix.length() == digits.length()){
            ret.add(prefix.toString());
            return;
        }

        // 获取当前按键的数字
        int curDigist = digits.charAt(prefix.length()) - '0';
        // 获取按键数字的字符
        String key = KEYS[curDigist];
        // 便利字符串
        for (Character c : key.toCharArray()){
            prefix.append(c);
            // 递归
            doCombination(prefix, ret, digits);
            // 删除最后一个字符，加入其它的字符
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }

    public static void main(String[] args) {
        LetterCombinations letterCombinations = new LetterCombinations();
        System.out.println(letterCombinations.letterCombinations("23"));
    }

}
