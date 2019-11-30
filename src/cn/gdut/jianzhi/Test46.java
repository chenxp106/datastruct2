package cn.gdut.jianzhi;

/**
 * @Desctiption 把数字翻译成字符串
 * @Date 2019/11/28/028
 **/
public class Test46 {
    public int numDecoding(String s){
        int n = s.length();
        if (s == null || n == 0){
            return 0;
        }
        // 定义dp
        int [] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2;i <= n; i++){
            int one = Integer.valueOf(s.substring(i-1,i));
            if (one != 0){
                dp[i] += dp[i-1];
            }
            if (s.charAt(i-2) == '0'){
                continue;
            }
            int two = Integer.valueOf(s.substring(i-2, i));
            if (two <= 26){
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Test46 test46 = new Test46();
        String a = "12258";
        System.out.println(test46.numDecoding(a));
    }
}
