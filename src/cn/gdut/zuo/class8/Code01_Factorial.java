package cn.gdut.zuo.class8;

/**
 * @Desctiption 求n!
 * @Date 2020/1/4/004
 **/
public class Code01_Factorial {
    public static long getFactoial(int n){
        if (n == 1){
            return 1;
        }
        return n * getFactoial(n - 1);
    }
    public static long getFactorial2(int n){
        long result = 1L;
        for (int i = 1;i <= n; i++){
            result *= i;
        }
        return result;
    }
}
