package cn.gdut.leetcode.tanxin;

/**
 * @ClassName CheckPossibility
 * @Desctiption 非递减数列。值修改一个数，判断是否为
 * @Date 2020/3/6 10:19
 */
public class CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        if (nums == null){
            return false;
        }
        int len = nums.length;
        int cnt = 0;
        for(int i = 1; i < nums.length; i++ ){
            if (nums[i] >= nums[i-1]) {
                continue;
            }
            // 否则，需要修改数字，统计修改次数的个数
            cnt++;
            // 有特殊情况 3 3 2的时候
            if (i >= 2 && nums[i-2] > nums[i]) {
                nums[i] = nums[i-1];
            }
            // 否则将
            else {
                nums[i-1] = nums[i];
            }
        }
        return cnt <= 1;
    }

    public static void main(String[] args) {
        CheckPossibility checkPossibility = new CheckPossibility();
        int [] a = {1,1,1};
        System.out.println(checkPossibility.checkPossibility(a));
    }
}
