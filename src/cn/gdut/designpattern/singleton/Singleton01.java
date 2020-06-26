package cn.gdut.designpattern.singleton;

/**
 * @ClassName Singleton01
 * @Desctiption 饿汉式
 * @Date 2020/6/26 22:23
 */
public class Singleton01 {

    // 类初始化时（没有延时加载的优势），立即加载这个对象加载类时，天然是线程安全的
    private static Singleton01 instance = new Singleton01();

    // 构造器私有化
    private Singleton01(){}

    // 提供公有的方法,供外部访问。方法没有同步，调用效率高
    public static Singleton01 getInstance(){
        return instance;
    }

}
