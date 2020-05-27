package cn.gdut.leetcode.array;

/**
 * @ClassName MoveZeroes
 * @Desctiption 283 移动零
 * @Date 2020/4/6 9:47
 */
public class MoveZeroes {
    public void moveZeroes(int [] nums){
//        int cnt = 0;
//        for (int i = 0; i < nums.length; i++){
//            if (nums[i] == 0){
//                cnt++;
//            }
//            else {
//                nums[i-cnt] = nums[i];
//            }
//        }
//        for (int i = nums.length - cnt; i <  nums.length; i++){
//            nums[i] = 0;
//        }
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
