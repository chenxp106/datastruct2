package cn.gdut.leetcode.array;

/**
 * @ClassName RemoveElement
 * @Desctiption 27 移除元素
 * @Date 2020/4/6 10:05
 */
public class RemoveElement {
    public int removeElement(int [] nums, int val){
//        int k = 0;
//        for (int i = 0; i < nums.length; i++){
//            if (nums[i] != val){
//                nums[k++] = nums[i];
//            }
//        }
//        return k;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                cnt++;

            }
            else {
                nums[i-cnt] = nums[i];
            }
        }
        return nums.length - cnt;
    }
}
