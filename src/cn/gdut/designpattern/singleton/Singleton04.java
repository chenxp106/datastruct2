package cn.gdut.designpattern.singleton;

/**
 * 双重检验锁
 */
public class Singleton04 {
    private volatile static Singleton04 singleton04;

    private Singleton04(){}

    public Singleton04 getSingleton04(){
        if (singleton04 == null){
            // 如果两个线程都进入if语句。只有一个线程能获取到锁，也就只有一个线程可以创建实例，当另外一个线程再次进入时，已经创建了实例直接返回。
            synchronized (Singleton04.class){
                if (singleton04 == null){
                    singleton04 = new Singleton04();
                }
            }
        }
        return singleton04;
    }
}
