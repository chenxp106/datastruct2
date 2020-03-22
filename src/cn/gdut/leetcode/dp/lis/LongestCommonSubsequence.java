package cn.gdut.leetcode.dp.lis;

/**
 * @ClassName LongestCommonSubsequence
 * @Desctiption TODO
 * @Date 2020/3/22 10:19
 */
public class LongestCommonSubsequence {

    private int lcs(String t1, String t2){
        int l1 = t1.length();
        int l2 = t2.length();
        if (l1 == 0 || l2 == 0){
            return 0;
        }
        if (t1.charAt(l1-1) == t2.charAt(l2 - 1)){
            return lcs(t1.substring(0, l1 - 2), t2.substring(0, l2 - 1)) + 1;
        }
        return Math.max( lcs(t1.substring(0, l1 - 2), t2) , lcs(t1, t2.substring(0, l2 - 2)) );
    }



    public int longestCommonSubsequence(String text1, String text2){
        if (text1 == null || text2 == null){
            return 0;
        }
        int n1 = text1.length();
        int n2 = text2.length();
        int [][] dp = new int[n1+1][n2+1];
        for (int i = 1; i <= n1; i++){
            for (int j = 1; j <= n2; j++){
                if (text1.charAt(i - 1) == text2.charAt(j - 1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[n1][n2];
    }
}

















