package cn.gdut.leetcode.array;

/**
 * @ClassName FindKthLargest
 * @Desctiption 215 找第k个大元素
 * @Date 2020/4/7 22:03
 */
public class FindKthLargest {

    public int findKthLargest(int [] nums, int k){
        return findKthLargest(nums, 0, nums.length - 1, k -1);
    }

    private int findKthLargest(int [] nums, int  low, int high, int k){
        int index = partion(nums, low, high);

        if (index > k){
            return findKthLargest(nums, low, high - 1, k);
        }
        else if (index <k){
            return findKthLargest(nums, low + 1, high, k);
        }
        else {
            return nums[index];
        }
    }

    private int partion(int [] nums, int low, int high){
        int i = low, j = high;
        int temp = nums[i];
        while (i < j){
            while (i < j && temp >= nums[j]){
                j--;
            }
            nums[i] = nums[j];
            while (i < j && temp <= nums[i]){
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = temp;
        return i;
    }

//    private int findKthLargest(int [] nums, int low, int high, int k){
//        // 一次快拍
//        int index = partition(nums, low, high);
//        if (index == k){
//            return nums[index];
//        }
//        else if (index > k){
//            return findKthLargest(nums, low, index - 1, k);
//        }
//        else {
//            return findKthLargest(nums, index + 1, high, k);
//        }
//
//    }
//
//    private int partition(int [] nums, int low, int high){
//        int temp = nums[low];
//        while (low < high){
//            while (low < high && temp >= nums[high]){
//                high--;
//            }
//            nums[low] = nums[high];
//            while (low < high && temp < nums[low]){
//                low++;
//            }
//            nums[high] = nums[low];
//        }
//        nums[low] = temp;
//        return low;
//    }

/*    private int findKthLargest(int [] nums, int low, int high, int k){
        int index = partition(nums, low, high);
        if (index == k){
            return nums[index];
        }
        else if (index > k){
            return findKthLargest(nums, low, index - 1, k);
        }
        else {
            return findKthLargest(nums, index+1, high, k);
        }
    }

    *//**
     * 一次快拍
     * @param nums
     * @param low
     * @param high
     * @return
     *//*
    private int partition(int [] nums, int low, int high){
        // 第一个元素
        int pivot = nums[low];
        while (low < high){
            while (low < high && nums[high] <= pivot){
                high--;
            }
            nums[low] = nums[high];
            while (low < high && nums[low] >= pivot){
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = pivot;
        return low;
    }*/
}


















