package cn.gdut.concurent.creatthread;

public class MyRunable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " run方法正在运行");
    }
}
