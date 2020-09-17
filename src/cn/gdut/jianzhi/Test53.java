package cn.gdut.jianzhi;

import java.util.HashSet;
import java.util.Set;

/**
 * @Desctiption 数字在排序数组中出现的 次数
 * @Date 2019/12/4/004
 **/
public class Test53 {
    public int GetNumberofK(int [] array, int target){
        // k起始位置
        int left = findIndex(array, target);
        // 终止位置
        int right = findIndex(array, target-1);
        return right - left;
    }
    /**
     * 1,2,3,3,3,3,4,6
     * l = 0, h = 8
     * mid = 4,
     *    h = mid=4
     *          mid = 2,
     *          h = mid = 2
     *              mid = 1
     *              l = mid =2
     *                  l < h 返回l=2
     *
     * k+1=4的时候
     * mid = 4,
     * l = mind + 1 = 5
     *  mind = 5+1 = 6
     *      5 > 4,
     *      l = mid+17
     *      h = mid= 6成立
     *      返回l
     */



    /**
     * 用二分查找，找到第一个数
     * @param array
     * @param k
     * @return
     */
    private int findIndex(int [] array, int k){
        int l = 0, h = array.length - 1;
        while (l <= k){
            int m = l + (h - l) / 2;
            if (k >= array[m]){
                l = m + 1;
            }
            else {
                h = m - 1;
            }
        }
        return l;
    }
}
