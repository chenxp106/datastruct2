package cn.gdut.designpattern.factory.factorymethod;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Date 2020/6/27 10:19
 */
public class Client {

    public static void main(String[] args) {
        Car car = new AudiFactory().createCar();
        Car car1 = new BenzFactory().createCar();

        car.run();
        car1.run();
    }
}
