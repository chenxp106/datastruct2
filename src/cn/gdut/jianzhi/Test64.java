package cn.gdut.jianzhi;

/**
 * @Desctiption 求1+2+3.。。
 * @Date 2019/12/13/013
 **/
public class Test64 {
    public int Sum_Solution(int n){
        int sum = n;
        boolean b = (n > 0) && ((sum += Sum_Solution(n-1)) > 0);
        return sum;
    }
}
