package cn.gdut.designpattern.factory.simplefactory;

/**
 * @ClassName Client2
 * @Desctiption 简单工厂情况下
 * @Date 2020/6/27 10:00
 */
public class Client2 {

    public static void main(String[] args) {
        Car car1 = CarFactory.createCar("奥迪");
        Car car2 = CarFactory.createCar("比亚迪");

        car1.run();
        car2.run();

        Audi audi = CarFactory2.createAudi();
        Byd byd = CarFactory2.createByd();
        audi.run();
        byd.run();
    }
}
