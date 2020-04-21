package cn.gdut.jianzhi;

public class Test15 {
/*    public int NumberOf1(int n){
        int cnt = 0;
        while (n != 0){
            cnt++;
            n = n & (n - 1);
        }
        return cnt;
    }*/

    /**
     * 不能直接n>0
     * @param n
     * @return
     */
    public int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0){
            cnt++;
            n = n & (n - 1);
        }
        return cnt;
    }

}
