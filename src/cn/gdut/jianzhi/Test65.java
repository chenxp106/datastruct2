package cn.gdut.jianzhi;

/**
 * @Desctiption 不用加减乘除做加法
 * @Date 2019/12/13/013
 **/
public class Test65 {
    public int Add(int num1, int num2){
//        while (num2 != 0){
//            // 不进位
//            int tmp = num1 ^ num2;
//            // 进位
//            num2 =  (num1 & num2) << 1;
//            num1 = tmp;
//        }
//        return num1;
        while (num2 != 0){
            int temp = num1 ^ num2;
            num2 = ( num1 & num2 ) << 1;
            num1 = temp;
        }
        return num1;

    }
}
