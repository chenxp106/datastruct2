package cn.gdut.jianzhi;

import java.util.Arrays;

/**
 * 将奇数放到偶数前面
 * 统计奇数的个数，然后拷贝数组。
 * 依次判断奇偶。空间复杂度为O(n)，时间复杂度为O（n)
 */
public class Test21 {
    public void reOrderArray(int [] array){
/*        // 先统计奇数的个数
        int oddCnt = 0;
        for (int x : array){
            if (isOdd(x)){
                oddCnt++;
            }
        }
        int [] copy = array.clone();
        // 奇数起始位和偶数起始位
        int i = 0;
        int j = oddCnt;
        for (int x : copy){
            if (isOdd(x)){
                array[i++] = x;
            }
            else {
                array[j++] = x;
            }
        }*/

        int [] temp = new int[array.length];
        // 统计奇数的个数
        int count = 0;
        for (int x : array){
            if (isOdd(x)){
                count++;
            }
        }
        temp = Arrays.copyOf(array, array.length);
        int i = 0; int j = count;
        for (int x : temp){
            if (isOdd(x)){
                array[i++] = x;
            }
            else {
                array[count++] = x;
            }
        }

    }

    private boolean isOdd(int x){
        return  x % 2 == 1 ;
    }



    public static void main(String[] args) {
        Test21 test21 = new Test21();
        int [] a = {1,2,3,4,5,6,7};
        test21.reOrderArray(a);
    }
}
