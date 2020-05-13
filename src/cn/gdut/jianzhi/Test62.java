package cn.gdut.jianzhi;

/**
 * @Desctiption 圆圈中剩下的数
 * 递归求解
 * (f(n-1,m)+m) % m
 * @Date 2019/12/12/012
 **/
public class Test62 {

    public int LastRemaining_Solution(int n, int m){
/*        if (n < 0){
            return -1;
        }
        if (n == 0){
            return 0;
        }
        else {
            return (LastRemaining_Solution(n-1,m) + m) % n;
        }*/
        if (n <= 0 || m <= 0){
            return -1;
        }
        int last = 0;
        for (int i = 2;i <= n; i++){
            last = (last + m) % i;
        }
        return last;
    }
}
