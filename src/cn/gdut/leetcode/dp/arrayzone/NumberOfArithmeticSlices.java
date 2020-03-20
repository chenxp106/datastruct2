package cn.gdut.leetcode.dp.arrayzone;

/**
 * @ClassName NumberOfArithmeticSlices
 * @Desctiption TODO
 * @Date 2020/3/20 10:50
 */
public class NumberOfArithmeticSlices {
    public int numberOfArithmeticSlices(int [] A){
        int [] dp = new int[A.length];
        int sum = 0;
        for (int i = 2; i < A.length; i++){
            if (A[i-1] - A[i-2] == A[i] - A[i-1]){
                dp[i] = dp[i-1] + 1;
                sum += dp[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        NumberOfArithmeticSlices  numberOfArithmeticSlices = new NumberOfArithmeticSlices();
        int [] a = {1,2,3,4};
        System.out.println(numberOfArithmeticSlices.numberOfArithmeticSlices(a));
    }
}
