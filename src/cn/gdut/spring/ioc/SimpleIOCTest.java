package cn.gdut.spring.ioc;

/**
 * @Desctiption TODO
 * @Date 2019/11/26/026
 **/
public class SimpleIOCTest {
    public static void main(String[] args) throws Exception {
        String loaction = SimpleIOC.class.getClassLoader().getResource("cn/gdut/spring/resources/ioc.xml").getFile();
        System.out.println(loaction);
        SimpleIOC simpleIOC = new SimpleIOC(loaction);
        Wheel wheel = (Wheel) simpleIOC.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) simpleIOC.getBean("car");
        System.out.println(car);
    }
}
