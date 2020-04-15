package cn.gdut.leetcode.sort;

/**
 * @ClassName HeapSort
 * @Desctiption TODO
 * @Date 2020/4/14 15:41
 */
public class HeapSort {

    /*private void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    *//**
     * 将第i个节点进行调整
     * @param tree
     * @param n
     * @param i
     *//*
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


    *//**
     * 建堆
     * @param tree
     * @param n
     *//*
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
    }*/

    // 调整第i个节点
    public void heapify(int [] tree, int n, int i){
        if (i >= n){
            return;
        }
        int c1 = i * 2 + 1;
        int c2 = i * 2 + 2;
        int max = i;
        if (c1 < n && tree[c1] < tree[max]){
            max = c1;
        }
        if (c2 < n && tree[c2] < tree[max]){
            max = c2;
        }
        if (i != max){
            swap(tree, i, max);
            // 继续调整
            heapify(tree, n, max);
        }
    }

    private void buildHeap(int [] tree, int n){
        // 获取最后一个节点下标
        int lastIndex = n - 1;
        // 最后一个父节点
        int parent = (lastIndex - 1 ) /  2;
        // 从父节点开始调整
        for (int i = parent; i >= 0; i--){
            heapify(tree, n, i);
        }
    }

    private void heapSort(int [] tree, int n){
        buildHeap(tree, n);
        for (int i = n - 1; i >= 0; i--){
            swap(tree, i, 0);
            heapify(tree, i, 0);
        }
    }

    private void swap(int [] tree, int i, int j){
        int temp = tree[i];
        tree[i] = tree[j];
        tree[j] = temp;
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












