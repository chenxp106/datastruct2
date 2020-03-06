package cn.gdut.leetcode.tanxin;

/**
 * @ClassName IsSubsequence
 * @Desctiption 392 判断是否为子序列
 * @Date 2020/3/6 9:55
 */
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        char [] ss = s.toCharArray();
        char [] tt = t.toCharArray();
        int index = 0;
        for (int i = 0; i < tt.length; i++) {
            if (t.charAt(index) != ss[i]){
                continue;
            }
            index++;
        }
        return index >= s.length();
    }
}
