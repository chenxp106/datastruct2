package cn.gdut.jianzhi;

public class Test11 {
/*    public int minNumberInRotateArray(int [] array){
        if (array == null || array.length == 0){
            return 0;
        }
        // 二分查找
        int l = 0;
        int h = array.length - 1;
        while (l < h){
            int m = l + (h - l) / 2;
            if (array[m] < array[h]){
                h = m;
            }
            else if (array[m] > array[h]){
                l = m+1;
            }
            else {
                h--;
            }
        }
        return array[l];
    }*/

    public int minNumberInRotateArray(int [] array){
        if (array == null || array.length == 0){
            return 0;
        }
        int l  = 0;
        int h = array.length - 1;
        while (l < h){
            int m = l + (h - l) / 2;
            if (array[l] < array[m]){
                l = m ;
            }
            else if (array[l] > array[m]){
                h = m;
            }
            else {
                l++;
            }
        }
        return array[l];
    }

    public static void main(String[] args) {
        Test11 test11 = new Test11();
        int [] a = {1,1,1,0,1};
//        int [] a = {3,4,5,1,2};
        System.out.println(test11.minNumberInRotateArray(a));
    }
}
