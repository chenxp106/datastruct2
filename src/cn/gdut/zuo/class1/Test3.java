package cn.gdut.zuo.class1;

import java.util.Arrays;

/**
 * @Desctiption TODO
 * @Date 2019/12/19/019
 **/
public class Test3 {

  /*  *
     * 一次插入，建立大根堆的一步
     * 将一个数插入到大根堆中。
     * 时间复杂度： O(logN)就是二叉树的深度。
     * 建立一个大根堆，即将所有的节点插入到二叉树中的时间复杂度 log1+log2+log3+...logn-1 = O(n)结论 收敛于O(n)
     * @param arr
     * @param index
     */
    private void heapInsert(int [] arr, int index){
        while (arr[index] > arr[(index - 1) / 2]){
            // 交换这两个数
            swap(arr, index, (index - 1) / 2);
            // 并且将当前index指向父节点
            index = (index - 1) / 2;
        }
    }
/*

    *
     * 进行一次往下调整的过程
     * @param arr 数组
     * @param index
     * @param heapSize 当前根堆的大小
*/

    private void heapify(int [] arr, int index, int heapSize){
        // 左孩子下标
        int left = index * 2 + 1;
        while (left < heapSize){
            // 如果右孩子存在（不越界）并且值比左孩子的值更大，则将left+1 置为更大值的下标。两个数比较
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            // 如果当前的值比左右两个还在更大的要小，将更大的换上去，自己下去。相当于三个数比较
            largest = arr[largest] > arr[index] ? largest : index;
            // 如果到了指定的位置，就不要再沉了
            if (largest == index){
                break;
            }
            // 到这里说明不相等，需要交换
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    private void swap(int [] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void heapSort(int [] arr){
        if (arr == null || arr.length == 0){
            return;
        }
        // 建立大根堆
        for (int i = 0 ;i < arr.length;i++){
            heapInsert(arr, i);
        }
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0){
            heapify(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }
    }

//    /**
//     * 下沉操作
//     * @param arr
//     * @param index
//     * @param heapSize
//     * @return
//     */
//    private void heapify(int [] arr, int index, int heapSize){
//        int left = 2 * index + 1;
//        // 出口条件
//        while (left < heapSize){
//            // 两个叶子节点比较，得到较大数的下标
//            int largest = left + 1 < heapSize && arr[left + 1] > arr[index] ? left + 1 : left;
//            // 三个数比较，得到较大数的下标
//            largest = arr[largest] > arr[index] ? largest : index;
//            if (largest == index){
//                break;
//            }
//            // 当前数下移动，
//            swap(arr, index, largest);
//            // index交换
//            index = largest;
//            left = 2 * index + 1;
//        }
//    }
//
//    private void swap(int [] arr, int i, int j){
//        int tmp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = tmp;
//    }
//
//    /**
//     * 建立初始堆
//     * @param arr
//     * @param index
//     */
//    public void heapInsert(int [] arr, int index){
//
//        // 交换
//        while (arr[index] > arr[(index-1) / 2] ){
//            swap(arr, index, (index - 1) / 2);
//            index = (index - 1) / 2;
//        }
//    }
//
//    /**
//     * 快速排序
//     * @param arr
//     */
//    private void heapSort(int [] arr){
//        if (arr == null || arr.length == 0){
//            return;
//        }
//        // 先建立大根堆
//        for (int i = 0;i < arr.length ;i++){
//            heapInsert(arr, i);
//        }
//        int heapSize = arr.length;
//        // 将第一个元素与最后一个元素交换一下
//        swap(arr, 0, --heapSize);
//        while (heapSize > 0){
//            heapify(arr, 0,  heapSize);
//            swap(arr, 0, --heapSize);
//        }
//    }


    public static void main(String[] args) {
        int [] a = {2,1,5,4,3};
        Test3 test3 = new Test3();
//        test3.heapSort(a);
        Arrays.sort(a);
        for (int x :a ){
            System.out.println(x);
        }
    }
}
