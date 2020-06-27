package cn.gdut.designpattern.factory.simplefactory;

/**
 * @ClassName Client1
 * @Desctiption 没有工厂模式
 * @Date 2020/6/27 9:54
 */
public class Client1 {
    public static void main(String[] args) {
        Car c1 = new Audi();
        Car c2 = new Byd();

        c1.run();
        c2.run();

    }
}
