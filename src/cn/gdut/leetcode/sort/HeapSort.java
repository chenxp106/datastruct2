package cn.gdut.leetcode.sort;

/**
 * @ClassName HeapSort
 * @Desctiption TODO
 * @Date 2020/4/14 15:41
 */
public class HeapSort {

    private void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    /**
     * 将第i个节点进行调整
     * @param tree
     * @param n
     * @param i
     */
    private void heapify(int [] tree, int n ,int i){
        if (i >= n){
            return;
        }
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int max = i;
        if (c1 < n && tree[c1] > tree[max]){
            max = c1;
        }
        if (c2 < n && tree[c2] > tree[max] ){
            max = c2;
        }
        if (max != i){
            swap(tree, max, i);
            heapify(tree, n, max);
        }
    }


    /**
     * 建堆
     * @param tree
     * @param n
     */
    private void buildHeap(int [] tree, int n){
        int last_node  = n - 1;
        int parent = (last_node - 1) / 2;
        for (int i = parent; i >= 0; i--){
            heapify(tree, n, i);
        }
    }

    public void heapSort(int [] tree, int n){
        buildHeap(tree, n);
        for (int i = n - 1; i >= 0; i--){
            swap(tree, i, 0);
            heapify(tree, i, 0);
        }
    }

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int [] tree = {1,10,3, 5, 20,2,4,5};
        int n = tree.length;
        heapSort.heapSort(tree, n);

        for (int x : tree){
            System.out.println(x);
        }
    }

}












