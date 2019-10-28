package cn.gdut.jianzhi;

/**
 * 斐波那契数列
 */
public class Test10 {
    /**
     * 将空间复杂度将到O(1)
     * @param n 要求的n
     * @return
     */
/*    private int Fibonacci(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        int pre0 = 0;
        int pre1 = 1;
        for (int i = 2;i<=n;i++){
            int c = pre0+ pre1;
            pre0 = pre1;
            pre1 = c;
        }
        return pre1;
    }*/

    /**
     * 用动态规划求解，定义dp[]
     *
     * @param n
     * @return
     */
    private int Fibonacci(int n){
        // 处理0和1
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        // 动态数组
        int [] dp = new int [n+1];
        // 初始赋值
        dp[0] = 0;
        dp[1] = 1;
        // 求解
        for (int i = 2; i <= n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Test10 test10 = new Test10();
        System.out.println(test10.Fibonacci(5));
    }
}
