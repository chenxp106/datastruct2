package cn.gdut.jianzhi;

public class Test14 {
    public int integetBreak(int n){
        if (n < 1){
            return 0;
        }
        if ( n == 2){
            return 1;
        }
        if (n == 3){
            return 2;
        }

        // 否则是>=4的情况
        int pow3 = n / 3;
        int mod = n % 3;
        if (mod == 1){
            return (int) (Math.pow(3, (pow3-1))*4);
        }
        else if (mod == 0){
            return (int) Math.pow(3,pow3);
        }
        else {
            return (int) (mod * Math.pow(3, pow3));
        }
    }
}
