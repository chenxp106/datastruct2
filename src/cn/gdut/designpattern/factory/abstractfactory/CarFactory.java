package cn.gdut.designpattern.factory.abstractfactory;

/**
 * @ClassName CarFactory
 * @Desctiption TODO
 * @Date 2020/6/27 10:41
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();

}
