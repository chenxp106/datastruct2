package cn.gdut.leetcode.shuangzhizhen;

/**
 * @ClassName ValidPalindrome
 * @Desctiption 判断是否为回文，可以删除一个字符
 * @Date 2020/3/2 21:29
 */
public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--){
            if (s.charAt(i) != s.charAt(j)){
                return isPalindrome(s, i+1, j) || isPalindrome(s, i, j - 1);
            }
        }
        return true;
    }

    /**
     * 判断是否回文
     * @param s
     * @param i
     * @param j
     * @return
     */
    private boolean isPalindrome(String s, int i, int j){
        while (i < j){
            if (s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
