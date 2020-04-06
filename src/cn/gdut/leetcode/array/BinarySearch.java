package cn.gdut.leetcode.array;

/**
 * @ClassName BinarySearch
 * @Desctiption 二分查找
 * @Date 2020/4/6 9:26
 */
public class BinarySearch {
    public int binarySarch(int [] nums, int n, int target){
        // 在[l,r]闭区间内寻找target
        int l = 0, r  = n - 1;
        // 为什么是 <=
        while (l <= r){
            int mid = l + (r- l) / 2;
            if (nums[mid] == target){
                return nums[mid];
            }
            if (nums[mid] < target){
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return -1;

    }
}












