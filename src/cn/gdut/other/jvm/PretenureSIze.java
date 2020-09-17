package cn.gdut.other.jvm;

public class PretenureSIze {
    private static final int _1Mb = 1024 *  1024;

    public static void main(String[] args) {
        test();
    }

    private static void test(){
        byte [] allocation ;
        allocation = new byte[4 * _1Mb];
    }
}
