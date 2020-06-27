package cn.gdut.designpattern.factory.factorymethod;

/**
 * @ClassName Audi
 * @Desctiption TODO
 * @Date 2020/6/27 9:48
 */
public class Benz implements Car {


    @Override
    public void run() {
        System.out.println("奔驰");
    }
}
