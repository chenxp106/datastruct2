package cn.gdut.jianzhi;

/**
 * @Desctiption 数组中只出现一次的数字
 * @Date 2019/12/6/006
 **/
public class Test56 {

    public int[] singleNumbers(int[] nums) {


        int diff = 0;
        for (int x : nums){
            diff = diff ^ x;
        }

        int flag = 1;
        while ((flag & diff )  == 0){
            flag = flag << 1;
        }

        int [] a = {0,0};
        for (int x : nums){
            if ( ( flag & x ) == 1 ){
                a[0] ^= x;
            }
            else {
                a[1] ^= x;
            }
        }
        return a;
    }






























    public void FindNumsAppearOnce(int [] array, int [] num1, int []num2){
        int diff = 0;
        for (int num : array){
            diff ^= num;
        }
        //diff &= -diff;
        int flag = 1;
        // 找1
        while((diff & flag) == 0){
            flag = flag << 1;
        }
        int a = 0;
        int b = 0;
        for(int n : array){
            if((n & flag) == 0){
                a ^= n;
            }else{
                b ^= n;
            }
        }
        System.out.println(a);
        System.out.println(b);
//        for (int num : array){
//            if ((diff ^= num) == 0){
//                num1[0] ^= num;
//            }
//            else {
//                num2[0] ^= num;
//            }
//        }
    }

    public static void main(String[] args) {
        Test56 test56 = new Test56();
        int []a = {1,2,10,4,1,4,3,3};
        int [] b = {1};
        int [] c = {1};
        test56.FindNumsAppearOnce(a,b,c);
//        System.out.println(b[0]+"=="+c[0]);
    }
}
