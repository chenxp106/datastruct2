package cn.gdut.jianzhi;

/**
 * @Desctiption 数字在排序数组中出现的 次数
 * @Date 2019/12/4/004
 **/
public class Test53 {
    public int GetNumberofK(int [] array, int k){
        // 分别统计k和k+1在数组中的下标
        int left = findIndex(array, k);
        int right = findIndex(array, k);
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

    private int findIndex(int [] array, int k){
        int l = 0;
        int h = array.length-1;
        while (l < h){
            int mind = l + (h - l) / 2;
            if (k > array[mind]){
                l=mind+1;
            }
            else {
                h = mind;
            }
        }
        return l;
    }
}
