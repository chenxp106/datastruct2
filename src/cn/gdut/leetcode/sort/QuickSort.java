package cn.gdut.leetcode.sort;

/**
 * @ClassName QuickSort
 * @Desctiption 快速排序
 * @Date 2020/4/14 9:53
 */
public class QuickSort {

    /*private int partition(int [] nums, int l, int h){
        // 比较的值，第一个
        int temp = nums[l];
        // 定义两个指针，分别指向切分元素的最小索引和最大索引
        int left = l;
        int right = h;

        // 切分
        while (left < right){
            // 先从右往左扫描，移动right指针，找到一个比分界值小的元素
            while ( left < right && temp <= nums[right] ){
                right--;
            }

            nums[left] = nums[right];
            // 然后从左往右扫描，移动left指针，找到一个比分界值大的元素
            while (left < right && temp > nums[left]){
                left++;
            }
            nums[right] = nums[left];

        }
        nums[left] = temp;
        return left;

    }

    private void sort(int [] nums, int l, int h){
        if (h <= l){
            return;
        }
        // 需要对数组中l到h的元素进行分组,左子组和右子组
        int index = partition(nums, l, h);
        // 对左子组排序
        sort(nums, l, index - 1);
        // 对右子组排序
        sort(nums, index + 1, h);
    }

    public void sort(int [] nums){
        sort(nums, 0, nums.length - 1);
    }*/

    public void sort(int [] nums){
        sort(nums, 0, nums.length - 1);
    }

    private void sort(int [] nums, int low, int high){
        if (low >= high){
            return;
        }
        int index = patition(nums, low, high);
        sort(nums, low, index - 1);
        sort(nums, index + 1, high);
    }

    // 一次快拍
    public int patition(int [] nums, int low, int high){
        int i = low;
        int j = high;
        int temp = nums[low];
        while (i < j){
            while (i < j && temp <= nums[j]){
                j--;
            }
            nums[i] = nums[j];
            while (i < j && temp > nums[i]){
                i++;
            }
            nums[j] = nums[i];

        }
        nums[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int [] nums = {4,1,6,3,5,2};
        sort.sort(nums);
        for (int n :nums){
            System.out.println(n);
        }
    }

}
