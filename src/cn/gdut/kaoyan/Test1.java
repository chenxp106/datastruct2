package cn.gdut.kaoyan;

/**
 * @Desctiption TODO
 * @Date 2019/12/9/009
 **/
public class Test1 {
    void f(int a[], int n){
        int i , last = 1;
        for (i = 1; i < n ;i++){
            a[i-1] = last * 2 * i;
            last = a[i-1];
        }
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        int [] a = {0,0,0,0,0,0};
        test1.f(a, 5);
        for (int x : a){
            System.out.println(x);
        }
    }
}
