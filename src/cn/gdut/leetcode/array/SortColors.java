package cn.gdut.leetcode.array;

/**
 * @ClassName SortColors
 * @Desctiption 75 颜色分类
 * @Date 2020/4/7 21:46
 */
public class SortColors {
    public void sortColors(int [] nums){
        int [] a = new int[3];
        for (int i = 0; i < nums.length; i++){
            a[nums[i]]++;
        }
        int index = 0;
        for (int i = 0; i < a[0]; i++){
            nums[index++] = 0;
        }
        for (int i = 0; i < a[1]; i++){
            nums[index++] = 1;
        }
        for (int i = 0; i < a[2]; i++){
            nums[index++] = 2;
        }
    }
}
