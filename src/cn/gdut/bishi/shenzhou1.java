package cn.gdut.bishi;

public class shenzhou1 {
    public static void main(String[] args) {

    }

    public int findGreatestSumOfSubArray (String[] array) {
        // write code here
        int n = array.length;
        int [] dp = new int[n];
        dp[0] = Integer.valueOf(array[0]);
        for (int i = 1; i < n; i++){
            dp[i] = Math.max(dp[i-1] + Integer.valueOf(array[i]),Integer.valueOf(array[i]));
        }
        int max = dp[0];
        for (int x : dp){
            max = Math.max(x, max);
        }
        return max;
    }
}
