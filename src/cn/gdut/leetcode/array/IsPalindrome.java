package cn.gdut.leetcode.array;

/**
 * @ClassName IsPalindrome
 * @Desctiption 125. 验证回文串
 * @Date 2020/4/8 9:32
 */
public class IsPalindrome {
    public boolean isPalindrome(String s){

        if (s == null || s.length() == 0){
            return true;
        }
        int i = 0, j = s.length() - 1;
        String low = s.toLowerCase();
        while (i < j){
            if (!Character.isLetterOrDigit(low.charAt(i))){
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
            i++;
            j--;
        }
        return true;
    }
}















