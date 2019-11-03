package cn.gdut.jianzhi;

public class Test16 {
    /**
     * 使用递归,相当于使用了折半，时间复杂度能到logn
     * 递归出口为n=1时加倍乘
     * 如果有余数1，在后面乘上.同时需要判断正负
     * @param base
     * @param exponent
     * @return
     */
    public double Power(double base, int exponent){
        // 递归出口
        if (exponent == 0){
            return 1;
        }
        if (exponent == 1){
            return base;
        }
        boolean isNegtive = false;
        if (exponent < 0){
            isNegtive = true;
            exponent = -exponent;
        }
        //
        double power = Power(base * base, exponent / 2);
        if (exponent % 2 == 1){
            power = base * power;
        }
        return isNegtive ? 1 / power : power;

    }

    public static void main(String[] args) {
        Test16 test16 = new Test16();
        System.out.println(test16.Power(2,7));
    }
}
