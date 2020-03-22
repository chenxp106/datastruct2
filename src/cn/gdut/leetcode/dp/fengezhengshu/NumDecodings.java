package cn.gdut.leetcode.dp.fengezhengshu;

/**
 * @ClassName NumDecodings
 * @Desctiption TODO
 * @Date 2020/3/21 9:37
 */
public class NumDecodings {
    public int numDecodings(String s){
        int [] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= s.length(); i++){
            if (s.charAt(i) != '0'){
                dp[i] += dp[i-1];
            }
            if (s.charAt(i-2) == '0'){
                continue;
            }
            if (Integer.valueOf(s.substring(i-2,i)) <= 26){
                dp[i] += dp[i-2];
            }
        }
        return dp[s.length()];
    }
}
