package cn.gdut.designpattern.factory.abstractfactory;

/**
 * @ClassName LuxuryCarFactory
 * @Desctiption TODO
 * @Date 2020/6/27 10:44
 */
public class LowCarFactory implements CarFactory
{
    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
