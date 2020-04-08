package cn.gdut.leetcode.array;

/**
 * @ClassName IsPalindrome
 * @Desctiption 125. 验证回文串
 * @Date 2020/4/8 9:32
 */
public class IsPalindrome {
    public boolean isPalindrome(String s){
        if (s.length() == 0){
            return false;
        }

        String low = s.toLowerCase();
        int i = 0;
        int j = low.length() - 1;
        while (i < j){
            if ( !Character.isLetterOrDigit(low.charAt(i))){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(low.charAt(j))){
                j--;
                continue;
            }
            if (low.charAt(i) != low.charAt(j)){
                return false;
            }

        }
        return true;
    }
}















