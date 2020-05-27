package cn.gdut.leetcode.array;

/**
 * @ClassName RemoveDuplicates
 * @Desctiption 26 删除排序数组中的重复项
 * @Date 2020/4/6 10:09
 */
public class RemoveDuplicates {
    public int removeDuplicates(int [] nums){
//        int i = 0;
//        for (int j = 1; j < nums.length; j++){
//            if (nums[j] != nums[i]){
//                i++;
//                nums[i] = nums[j];
//            }
//        }
//        return i + 1;
        int cnt = 0;
        for (int i = 1;i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                cnt++;
            }
            else {
                nums[i-cnt] = nums[i];
            }
        }
        return nums.length - cnt;
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int [] a = {1,1,2};
        System.out.println(removeDuplicates.removeDuplicates(a));
    }
}
