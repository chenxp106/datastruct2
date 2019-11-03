package cn.gdut.jianzhi;

public class Test14 {
    public int integetBreak(int n){
        if (n <= 1){
            return 0;
        }
        if (n == 2){
            return 1;
        }
        if (n == 3){
            return 2;
        }
        int pow3 = n / 3;
        if (n - pow3 * 3 == 1){
            pow3--;
        }
        int pow2 = (n - pow3 * 3) / 2;
        return (int) (Math.pow(3, pow3) * Math.pow(2,pow2));
    }
}
