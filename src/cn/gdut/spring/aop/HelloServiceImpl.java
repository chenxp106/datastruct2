package cn.gdut.spring.aop;

/**
 * @Desctiption TODO
 * @Date 2019/11/26/026
 **/
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("hello word");
    }
}
