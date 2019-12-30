package cn.gdut.zuo.class5;

/**
 * @Desctiption 布隆过滤器
 * 空间开多大，由样本量大小和失误率决定
 * @Date 2019/12/29/029
 **/
public class Code_Test {

    public static void main(String[] args) {
        int [] arr = new int[1000];
        int index = 30000;
        int intIndex = index / 32;
        int bitIndex = index % 32;
        arr[intIndex] = (arr[intIndex] | (1 << bitIndex));
    }
}
