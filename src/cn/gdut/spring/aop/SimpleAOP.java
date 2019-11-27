package cn.gdut.spring.aop;

import java.lang.reflect.Proxy;

/**
 * @Desctiption TODO
 * @Date 2019/11/26/026
 **/
public class SimpleAOP {
    public static Object getProxy(Object bean, Advice advice){
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(), bean.getClass().getInterfaces(), advice);
    }
}
