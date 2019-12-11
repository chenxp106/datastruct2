package cn.gdut.jianzhi;

import java.util.Arrays;

/**
 * @Desctiption 扑克的顺子
 * @Date 2019/12/11/011
 **/
public class Test61 {

    public boolean isContinuous(int [] numbers){
        if (numbers == null || numbers.length == 0){
            return false;
        }
        int k = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 0){
                k++;
                continue;
            }
            if (i != 0 && numbers[i-1] != 0 ){
                // 如果有相同的直接返回false
                if (numbers[i] == numbers[i-1]){
                    return false;
                }
                // 空的个数
                int  m = numbers[i] - numbers[i-1] - 1;
                k = k - m;
            }
        }
        return k >= 0;
    }

    public static void main(String[] args) {
        Test61 test61 = new Test61();
        int [] a = {0,3,2,6,4};
        test61.isContinuous(a);
    }
}
