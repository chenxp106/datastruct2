package cn.gdut.jianzhi;

/**
 * @Desctiption 连续子数组的最大和
 * @Date 2019/11/26/026
 **/
public class Test42 {

    public int FindGreatestSumOfSubArray(int [] array){
        if (array == null || array.length == 0){
            return 0;
        }
        int great = Integer.MIN_VALUE;
        int sum = 0;
        for (int x : array){
            if (sum < 0){
                sum = x;
            }
            else {
                sum += x;
            }
            great = Math.max(great, sum);
        }
        return great;

        /*
        *if (array == null || array.length == 0){
            return 0;
        }
        int curMax = array[0];
        int cur = array[0];
        for ( int i = 1;i < array.length; i++){
            cur = cur + array[i];
            // 如果当前的值更大，则交换。否则
            if (cur > curMax){
                curMax = cur;
            }
        }
        return curMax;
        * */
    }
}
