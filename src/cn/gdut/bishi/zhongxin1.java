package cn.gdut.bishi;

public class zhongxin1 {
    public static void main(String[] args) {

        System.out.println(primeSum(10,20));
    }

    private static int primeSum(int n, int m){
        int res = 0;
        for (int i = n; i <= m; i++){
            if (isPrime(i)){
                res += i;
            }
        }
        return res;
    }

    private static boolean isPrime(int n){
        if (n < 2){
            return false;
        }
        for (int i = 2;i < n;i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
