package cn.gdut.zuo.class1;

/**
 * @Desctiption 快速排序
 * @Date 2019/12/17/017
 **/
public class Test2 {

    private void quickSort(int [] arr, int L, int R){
        if (L <R){
            int [] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1);
            quickSort(arr, p[1]+1, R);
        }
    }

    private int []  partition(int [] arr, int L, int R){
        int less = L - 1 ;
        int more = R ;
        while (L < more){
            if (arr[L] < arr[R]){
                swap(arr, ++less, L++);
            }
            else if (arr[L] > arr[R]){
                swap(arr, --more, L);
            }
            else {
                L++;
            }
        }
        swap(arr, more, R);
        return new int[] {less+1, more};
    }

    private void swap(int [] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        int [] a = {5,3,4,6,3};
        test2.sort(a, 0, a.length-1  );
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public int [] partion(int [] nums, int L, int R){
        int num = nums[L];
        int less = L - 1;
        int more = R + 1;
        int cur = L;
        while (cur < more){
            if (nums[cur] < num){
                swap(nums, ++less, cur++);
            }
            else if (nums[cur] > num){
                swap(nums, --more, cur);
            }
            else {
                cur++;
            }
        }
        return new int[]{less+1,cur};
    }

    private void sort(int [] nums, int L ,int R){
        if (L < R){
            int[] partion = partion(nums, 0, nums.length - 1);
            sort(nums, L , partion[0]-1);
            sort(nums, partion[1]+1, R);
        }
    }
}
