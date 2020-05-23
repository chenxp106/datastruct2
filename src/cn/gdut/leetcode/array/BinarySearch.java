package cn.gdut.leetcode.array;

/**
 * @ClassName BinarySearch
 * @Desctiption 二分查找
 * @Date 2020/4/6 9:26
 */
public class BinarySearch {
    public static int binarySarch(int [] nums, int n, int target){
//        // 在[l,r]闭区间内寻找target
//        int l = 0, r  = n - 1;
//        // 为什么是 <=
//        while (l <= r){
//            int mid = l + (r- l) / 2;
//            if (nums[mid] == target){
//                return nums[mid];
//            }
//            if (nums[mid] < target){
//                l = mid + 1;
//            }
//            else {
//                r = mid - 1;
//            }
//        }
//        return -1;
        int l = 0, h = n - 1;
        while (l <= h){
            int m = l + (h - l) / 2;
            if (nums[m] > target){
                h = m - 1;
            }
            else if (nums[m] < target){
                l = m + 1;
            }
            else {
                return m;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7};
        System.out.println(binarySarch(a, 7, 7));
    }
}












