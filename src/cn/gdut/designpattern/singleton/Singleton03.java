package cn.gdut.designpattern.singleton;

/**
 * @ClassName Singleton03
 * @Desctiption 静态内部类
 * 线程安全，调用效率高，并且实现了延时加载
 * @Date 2020/6/27 8:54
 */
public class Singleton03 {

    private static class SingletonClassInstance {
        private static final Singleton03 instance = new Singleton03();
    }

    private Singleton03() {}

    public Singleton03 getInstance () {
        return SingletonClassInstance.instance;
    }
}
