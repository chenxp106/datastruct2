package cn.gdut.other.javabase;

/**
 * 成员内部类
 * 成员内部类可以访问外部成员变量和静态变量
 */
public class Outer2 {
    private static  int radius = 1;
    private int count =2;

    class Inner {
        public void visit() {
            System.out.println("visit outer static  variable:" + radius);
            System.out.println("visit outer   variable:" + count);
        }
    }

    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        Outer2.Inner inner = outer2.new Inner();
        inner.visit();
    }
}
