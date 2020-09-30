package cn.gdut.other.javabase;

/**
 * 匿名内部类
 * 匿名内部类就是没有名字的内部类，日常开发中使用的比较多。
 * 除了没有名字：还有以下几个特点
 * 匿名内部类必须继承一个抽象类或者是实现一个接口
 * 匿名内部类不能定义任何静态成员或是静态方法
 * 当所在的方法的形参需要被匿名内部类使用时，必须声明为final
 * 匿名内部类不能是抽象的，它必须实现继承的类火灾实现接口中的所有抽象方法
 *
 */
public class Outer4 {
    private void test(final int i) {
        new Service() {
            public void method() {
                for (int j = 0; j < i; j++) {
                    System.out.println("匿名内部类" );
                }
            }
        }.method();
    }
    public static void main(String[] args) {
        Outer4 outer4 = new Outer4();
        outer4.test(4);
    }
}
interface Service{
    void method();
}