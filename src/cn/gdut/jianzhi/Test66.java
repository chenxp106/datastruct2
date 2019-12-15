package cn.gdut.jianzhi;

/**
 * @Desctiption 构建乘积数组
 * 两头都是从1开始计算
 * @Date 2019/12/15/015
 **/
public class Test66 {
    public int [] multiply(int [] A){

        int n = A.length;
        // 创建一个数组
        int [] A1 = new int[n];
        A1[0] = 1;
        for (int i = 1;i < n; i++) {
            A1[i] = A[i - 1] * A1[i - 1];
        }
        // 创建第二个数组
        int [] A2 = new int[n];
        A2[n-1] = 1;
        for (int i = n-2 ;i >= 0;i--){
            A2[i] = A2[i+1] * A[i+1];
        }
        // 第三次遍历
        for (int i = 0; i < n;i++){
            A[i] = A1[i] * A2[i];
        }
        return A;

    }

    public static void main(String[] args) {
        Test66 test66 = new Test66();
        int [] a = {1,2,3,4,5};
        test66.multiply(a);
    }
}
