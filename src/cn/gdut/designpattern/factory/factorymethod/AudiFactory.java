package cn.gdut.designpattern.factory.factorymethod;

/**
 * @ClassName AudiFactory
 * @Desctiption TODO
 * @Date 2020/6/27 10:17
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
