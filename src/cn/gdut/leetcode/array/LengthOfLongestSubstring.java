package cn.gdut.leetcode.array;

/**
 * @ClassName LengthOfLongestSubstring
 * @Desctiption 3 无重复字符的最长子串
 * @Date 2020/4/9 21:13
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
        int [] freq = new int[256];
        int l = 0,  r = -1;
        int res = 0;

        while ( l < s.length()){
            // 当前没有出现过这个字符，右边可以加1
            if (r + 1 < s.length() && freq[s.charAt(r+1)] == 0){
                r++;
                // 加入到数组中
                freq[s.charAt(r)] ++;
            }
            else {
                freq[s.charAt(l)]--;
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}










