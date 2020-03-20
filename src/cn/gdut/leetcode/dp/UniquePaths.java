package cn.gdut.leetcode.dp;

/**
 * @ClassName UniquePaths
 * @Desctiption TODO
 * @Date 2020/3/19 10:16
 */
public class UniquePaths {
    public int uniquePaths(int m, int n){
        int [][] dp = new int[m][n];
        // 将第一行和第一列置1
        for (int i = 0; i < n; i++){
            dp[0][i] = 1;
        }
        for (int j = 0; j < m; j++){
            dp[j][0] = 1;
        }
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        UniquePaths uniquePaths = new UniquePaths();
        System.out.println(uniquePaths.uniquePaths(3, 2));
    }
}
