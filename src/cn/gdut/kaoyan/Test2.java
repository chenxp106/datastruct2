package cn.gdut.kaoyan;

/**
 * @Desctiption TODO
 * @Date 2019/12/10/010
 **/
public class Test2 {
    void test(int [] L){
        int i , j, k = 0;
        for (i = 0 ; i < L.length; i++){
            for (j = 0 ;j < k && L[i] !=L[j];j++);
            if (j == k){
                if (k != i){
                    L[k] = L[i];
                }
                k++;
            }

        }
        int m = 2;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        int [] a = {3,7,3,2,1,1,8,7,3};
        test2.test(a);
    }
}
