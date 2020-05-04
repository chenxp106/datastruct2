package cn.gdut.jianzhi;


/**
 * @Desctiption 连续子数组的最大和
 * @Date 2019/11/26/026
 **/
public class Test42 {

    public int FindGreatestSumOfSubArray(int [] array){
//
//        int curMax = array[0];
//        int sum = 0;
//        for (int i = 0;i < array.length;i++){
//            if (sum <= 0){
//                sum = array[i];
//            }
//            else {
//                sum = sum + array[i];
//            }
//            curMax = Math.max(sum, curMax);
//        }
//        return curMax;
        if (array == null || array.length == 0 ){
            return 0;
        }
        int curMaxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int x : array){
            sum = sum <= 0 ? x : sum + x;
            curMaxSum = Math.max(curMaxSum, sum);
        }
        return curMaxSum;
    }
}
