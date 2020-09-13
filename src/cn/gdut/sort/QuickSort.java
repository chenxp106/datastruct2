package cn.gdut.sort;

public class QuickSort {

    private static void quickSort(int [] arr, int l, int h){
        int i = l;
        int j = h;
        int temp ;
        if (l < h){
            temp = arr[l];
            while (i < j){
                while (i < j && temp < arr[j]){
                    j--;
                }
                arr[i] = arr[j];
                while (i < j && temp >= arr[i]){
                    i++;
                }
                arr[j] = arr[i];
            }
            arr[i] = temp;
            quickSort(arr, l, i-1);
            quickSort(arr, i+1, h);
        }
    }

    public static void sort(int [] nums){
        quickSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int [] nums  = {4,2,6,5,2,8};
        sort(nums);
        for(int x : nums){
            System.out.println(x);
        }
    }


}
