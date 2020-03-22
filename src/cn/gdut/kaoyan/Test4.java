package cn.gdut.kaoyan;

/**
 * @Desctiption TODO
 * @Date 2019/12/16/016
 **/
public class Test4 {

    long f21(int t, int m, int n){
        int i ;
        long s = 0, a=0;
        for(i=1;i<m; i++){
            a=a*10+t;
        }

        for(i = m;i <=n;i++){
            a=a*10+t;
            s+=a;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(1);
    }
}
