package cn.gdut.designpattern.factory.simplefactory;

/**
 * @ClassName CarFactory
 * @Desctiption
 * 简单工厂，也叫静态工厂模式，就是工厂类一般使用的是静态方法。用过接收的参数
 * 不同来返回不同的对象实例
 * 缺点： 对增加新产品无能为力！不修改代码的话，是无法扩展的
 * @Date 2020/6/27 9:57
 */
public class CarFactory2 {

    public static Audi createAudi(){
        return new Audi();
    }

    public static Byd createByd(){
        return new Byd();
    }
}
