package cn.gdut.designpattern.factory.abstractfactory;

/**
 * @ClassName LuxuryCarFactory
 * @Desctiption TODO
 * @Date 2020/6/27 10:44
 */
public class LuxuryCarFactory implements CarFactory
{
    @Override
    public Engine createEngine() {
        return new LuxryEngine();
    }

    @Override
    public Seat createSeat() {
        return new  LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxueryTyre();
    }
}
