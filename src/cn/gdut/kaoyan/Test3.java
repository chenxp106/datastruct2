package cn.gdut.kaoyan;

/**
 * @Desctiption TODO
 * @Date 2019/12/10/010
 **/
public class Test3 {

    void test(int [] L){
        int i = L.length - 1 ,t;
        while (i > 0){
            int f = 0;
            for (int j = 0 ;j < i ; j++){
                if (L[j] > L[j+1]){
                    t = L[j];
                    L[j] = L[j+1];
                    L[j+1] = t;
                    f = j;
                }
            }
            i = f;
        }
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        int [] a = {4,3,2,1};
        test3.test(a);
    }
}
