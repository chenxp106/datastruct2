package cn.gdut.jianzhi;

public class Test15 {
    /**
     * 计算1的个数。n & (n-1)
     * @param n
     * @return
     */
    public int NumberOf1(int n){
        int cnt = 0;
        while (n != 0){
            cnt++;
            n = n & (n-1);
        }
        return cnt;
    }
}
