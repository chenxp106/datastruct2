package cn.gdut.other.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @ClassName CallableDemo
 * @Desctiption 线程实现的三种方式
 * @Date 2020/4/12 20:25
 */

/**
 * 实现Runable接口
 */
class MyThread implements Runnable{

    @Override
    public void run() {

    }
}

/**
 * 实现Callable接口
 */
class MyThread2 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("********* comin mythread");
        return 1024;
    }
}


public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, Exception {
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread2());
        Thread t1 = new Thread(futureTask);
        t1.start();
        System.out.println(futureTask.get());

    }
}










