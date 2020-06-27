package cn.gdut.designpattern.factory.abstractfactory;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Date 2020/6/27 10:46
 */
public class Client {
    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine engine = factory.createEngine();
        engine.run();
        engine.start();
    }
}
