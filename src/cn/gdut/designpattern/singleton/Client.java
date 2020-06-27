package cn.gdut.designpattern.singleton;

import cn.gdut.leetcode.stackandqueue.Singleton;

import java.lang.reflect.Constructor;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Date 2020/6/27 9:01
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        /**
         * 使用反射可以调到单例
         */
        Class<Singleton01> clazz = (Class<Singleton01>) Class.forName("cn.gdut.designpattern.singleton.Singleton01");
        Constructor<Singleton01> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);

        Singleton01 singleton01 = c.newInstance();
        Singleton01 singleton02 = c.newInstance();
        System.out.println(singleton01);
        System.out.println(singleton02);
    }
}













