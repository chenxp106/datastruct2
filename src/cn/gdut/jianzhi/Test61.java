package cn.gdut.jianzhi;

import java.util.Arrays;

/**
 * @Desctiption 扑克的顺子
 * @Date 2019/12/11/011
 **/
public class Test61 {

    public boolean isContinuous(int [] nums){

        /**
         * 先排序，然后统计0的个数
         * 如果前一个数不为0，如果当前树与前一个数相等，则直接返回false，否则将中间的数用0补上，查看需要多少个0
         */
        /*if (numbers == null || numbers.length == 0){
            return false;
        }
        Arrays.sort(numbers);
        // 统计0的个数
        int cnt = 0;
        for (int x : numbers){
            if (x == 0){
                cnt++;
            }
            else {
                break;
            }
        }
        for (int k = cnt; k < numbers.length - 1; k++){
            if (numbers[k + 1] == numbers[k]){
                return false;
            }
            int m = numbers[k + 1] - numbers[k] - 1;
            cnt -= m;
        }
        return cnt >= 0;*/

        // 判空
        if (nums == null || nums.length == 0){
            return false;
        }

        // 先排序
        Arrays.sort(nums);
        int c0 = 0;

        // 0 2 3 4 6
        for (int i  = 0; i < nums.length - 1; i++){
            // 统计0的个数
            if (nums[i] == 0){
                c0++;
            }
            // 如果出现相同的直接返回false
            else if (nums[i+1] == nums[i]){
                return false;
            }
            else {
                // 需要王的个数
                c0 -= (nums[i+1] - nums[i] - 1);
            }

        }
        return c0 >= 0;

    }

    public static void main(String[] args) {
        Test61 test61 = new Test61();
        int [] a = {0,3,2,6,4};
        System.out.println(test61.isContinuous(a));
    }
}
