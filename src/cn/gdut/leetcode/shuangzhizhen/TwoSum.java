package cn.gdut.leetcode.shuangzhizhen;

/**
 * @ClassName TwoSum
 * @Desctiption 有序数组中找到和位target的两个数
 * @Date 2020/2/29 21:34
 */
public class TwoSum {
    /**
     * 因为是有序的，使用双指针
     * @param numbers
     * @param target
     * @return
     */
    public int [] twoSum(int [] numbers, int target){
        int [] result = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j){
            int sum = numbers[i] + numbers[j];
            if (sum > target){
                j--;
            }
            else if (sum < target){
                i++;
            }
            else {
                result[0] = i+1;
                result[1] = j+1;
                break;
            }
        }
        return result;
    }
}
