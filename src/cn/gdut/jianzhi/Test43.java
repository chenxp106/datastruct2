package cn.gdut.jianzhi;

/**
 * @Desctiption TODO
 * @Date 2019/11/27/027
 **/
public class Test43 {
    public int NumberOf1Between1AndN_Solution(int n){
        int cnt = 0, k;
        int i = 1;
        while (!((n/i) == 0)){
            k = n/i;
            // k/10为高位数字
            cnt += (k/ 10)*i;
            //  当前位的数字
            int cur = k % 10;
            if (cur > 1){
                cnt += i;
            }
            else if (cur == 1){
                // n - k*i 为低位的数字
                cnt += n - k * i +1;

            }
            i = i*10;
        }
        return cnt;
    }
}
