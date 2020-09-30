package cn.gdut.bishi;

public class jianxin2 {
    public static void main(String[] args) {

        int []  a = {1,2,2,1,4};
        System.out.println(uniqueAward(a));
    }

    public static int uniqueAward (int[] nums) {
        // write code here
        int x = nums[0];
        for (int i = 1; i< nums.length; i++){
            x = x ^ nums[i];
        }
        return x;
    }
}
