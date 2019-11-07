package cn.gdut.jianzhi;

/**
 * 将奇数放到偶数前面
 * 统计奇数的个数，然后拷贝数组。
 * 依次判断奇偶。空间复杂度为O(1)，时间复杂度为O（n)
 */
public class Test21 {
    public void reOrderArray(int [] array){
        // 奇数的个数
        int olddCnt = 0;
        for (int x : array){
            if (isOdd(x)){
                olddCnt++;
            }
        }
        //数组拷贝
        int [] copy = array.clone();
        int i = 0, j = olddCnt;
        for (int num : copy){
            if (num % 2 == 1){
                array[i++] = num;
            }
            else {
                array[j++] = num;
            }
        }
    }

    /**
     * 是否为奇数
     * @param x
     * @return
     */
    private boolean isOdd(int x){
        if (x % 2 == 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Test21 test21 = new Test21();
        int [] a = {1,2,3,4,5,6,7};
        test21.reOrderArray(a);
    }
}
