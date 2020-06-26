package cn.gdut.leetcode.stackandqueue;

/**
 * @ClassName Singleton01
 * @Desctiption 双重锁对象实现单例
 * @Date 2020/4/3 20:33
 */
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        // 先判断对象是否实例化，没有实例化才进入加锁代码
        if (singleton == null){
            // 类对象加锁
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}











