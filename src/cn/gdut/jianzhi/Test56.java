package cn.gdut.jianzhi;

/**
 * @Desctiption 数组中只出现一次的数字
 * @Date 2019/12/6/006
 **/
public class Test56 {
    public void FindNumsAppearOnce(int [] array, int [] num1, int []num2){
        int diff = 0;
        for (int num : array){
            diff ^= num;
        }
        diff &= -diff;
        for (int num : array){
            if ((diff ^= num) == 0){
                num1[0] ^= num;
            }
            else {
                num2[0] ^= num;
            }
        }
    }

    public static void main(String[] args) {
        Test56 test56 = new Test56();
        int []a = {2,1,6,1,2,3};
        int [] b = {1};
        int [] c = {1};
        test56.FindNumsAppearOnce(a,b,c);
        System.out.println(b[0]+"=="+c[0]);
    }
}
