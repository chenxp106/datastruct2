package cn.gdut.leetcode.sort;

/**
 * @ClassName MergeSort
 * @Desctiption g归并排序
 * 需要一个辅助数组 空间复杂度O(n)
 * @Date 2020/4/14 9:15
 */
public class MergeSort {
/*    public void sort(int [] nums){
        int [] tem= new int[nums.length];
        sort(nums, 0, nums.length - 1, tem);
    }

    private void sort(int [] nums, int l, int h, int [] temp){
        // 采用分而治之的思想
        if (l < h){
            int m = l + (h - l) / 2;
            sort(nums, l, m, temp);
            sort(nums, m+1, h, temp);
            merge(nums, l, m, h, temp);
        }
    }

    *//**
     * 合并
     * @param nums
     * @param l
     * @param m
     * @param h
     * @param temp
     *//*
    private void merge(int [] nums, int l, int m, int h, int [] temp){
        int i = l;
        int j = m + 1;
        int t = 0;
        while ( i <= m && j <= h){
            if (nums[i] <= nums[j]){
                temp[t++] = nums[i++];
            }
            else {
                temp[t++] = nums[j++];
            }
        }
        // 将剩余的部分接回到temp中
        while (i <= m){
            temp[t++] = nums[i++];
        }
        while (j <= h){
            temp[t++] = nums[j++];
        }

        // 将temp数组赋值会nums中
        for (i = 0; i < t; i++){
            nums[l+i] = temp[i];
        }
    }*/

    public void sort(int [] nums){
        int [] temp = new int[nums.length];
        sort(nums, 0, nums.length - 1, temp);
    }

    // 递归
    private void sort(int [] nums, int low, int high, int [] temp){
        if (high <= low){
            return;
        }
        int mid = low + (high - low) / 2;
        sort(nums, low, mid, temp);
        sort(nums, mid + 1, high, temp);

        merge(nums, low, mid, high, temp);
    }

    // 将[low,high]合并
    private void merge(int [] nums, int low, int mid, int high, int [] temp){
        int i = low, j = mid + 1;
        int t = low;
        while (i < mid && j < high){
            if (nums[i] < nums[j]){
                temp[t++] = nums[i++];
            }else {
                temp[t++] = nums[j++];
            }
        }
        // 将剩余的添加上
        while (i <= mid){
            temp[t++] = nums[i++];
        }
        while (j <= high){
            temp[t++] = nums[j++];
        }
        int k = low;
        // 将temp复制会nums中
        for (t = low; t <= high;t++){
            temp[t++] = nums[k++];
        }

    }

    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        int [] nums = {6,5,4,3,2,1};
        sort.sort(nums);
        for (int n :nums){
            System.out.println(n);
        }
    }
}
