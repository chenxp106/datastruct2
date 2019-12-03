package cn.gdut.jianzhi;

/**
 * @Desctiption 数组中的逆序对
 * @Date 2019/12/3/003
 **/
public class Test51 {
    int cnt = 0;
    int [] tmp;

    public int InversePairs(int [] array){

        if (array == null || array.length <= 0){
            return 0;
        }
        tmp = new int[array.length];
        mergeSort(array, 0,array.length-1);
        return (int) (cnt % 1000000007);

    }

    /*private int mergeSort(int [] array, int start, int end){
        if (start == end ){
            return 0;
        }
        int mid = (start + end) / 2;
        // 前半段的个数
        int leftCount = mergeSort(array, start, mid);
        // 后半段的个数
        int rightCount = mergeSort(array,mid + 1, end);
        int i = mid, j = end;
        int [] tmp = new int[end - start + 1];
        int index = end - start;
        int count = 0;
        // 分别指向后面最大的两个数
        while (i >= start && j >= mid + 1){
            // 左边最大的比右边大，逆序的个数为右边的所有个数和。并将左边的数考到tmp中
            if (array[i] > array[j]){
                tmp[index--] = array[i--];
                count += j - mid;
                if (count > 1000000007){
                    count %= 1000000007;
                }
            }
            // 否则。将右边的数拷贝。个数不变
            else {
                tmp[index--] = array[j--];
            }
        }
        // 将剩余的个数添上
        while (i >= start){
            tmp[index--] = array[i--];
        }
        while (j >= mid + 1){
            tmp[index--]= array[j--];
        }
        // 将tmp的数组拷贝回去
        i = 0;
        while (start <= end){
            array[start++] = tmp[i++];
        }
        return (leftCount + rightCount) % 1000000007;
    }*/

    private void mergeSort(int [] array, int l, int h){
        if (h - l < 1){
            return;
        }
        int m = l + (h-l) / 2;
        mergeSort(array, l, m);
        mergeSort(array, m+1,h);
        merge(array,l,m,h);

    }

    private void merge(int [] nums, int l, int m, int h){
        int i = l, j = m + 1, k = l;
        while (i <= m || j <= h){
            if (i > m)
                tmp[k] = nums[j++];
            else if (j > h)
                tmp[k] = nums[i++];
            else if (nums[i] <= nums[j])
                tmp[k] = nums[i++];
            else {
                tmp[k] = nums[j++];
                this.cnt += m - i + 1;
            }
            k++;
        }
        for (k = l; k <= h; k++){
            nums[k] = tmp[k];
        }
    }
}
