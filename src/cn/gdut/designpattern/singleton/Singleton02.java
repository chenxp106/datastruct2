package cn.gdut.designpattern.singleton;


/**
 * @ClassName Singleton02
 * @Desctiption 懒汉式加载
 * @Date 2020/6/26 22:33
 */
public class Singleton02 {

    // 类初始化时，不立即创建这个对象。
    private static Singleton02 instance;

    private Singleton02() {}

    // 只有调用这个对象的时候，才会去创建这个对象。达到了延时加载的效果。
    // 需要加synchronized关键字。因为有多线程的情况
    public static synchronized Singleton02 getInstance (){
        if (instance == null){
            instance = new Singleton02();
        }
        return instance;
    }
}
