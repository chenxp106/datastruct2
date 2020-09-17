package cn.gdut.jianzhi;

/**
 * @Desctiption 圆圈中剩下的数
 * 递归求解
 * (f(n-1,m)+m) % m
 * @Date 2019/12/12/012
 **/
public class Test62 {

    public int LastRemaining_Solution(int n, int m){

        return fun(n, m);
    }
    private int fun(int n, int m){
        // 最后一个数
        if (n == 1){
            return 0;
        }
        int x = fun(n - 1, m);
        return (m + x) % n;
    }
}
