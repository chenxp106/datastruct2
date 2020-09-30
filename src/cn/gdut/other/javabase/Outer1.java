package cn.gdut.other.javabase;

/**
 * 静态内部类
 * 静态内部类可以访问外部所有静态属性
 * 不能访问非静态属性
 */
public class Outer1 {
    private static int radius = 1;

    private int a = 2;

    static class StaticInner {
        public void visit() {
            System.out.println("visit outer static  variable:" + radius);
        }
    }
}
