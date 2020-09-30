package cn.gdut.concurent.creatthread;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "run方法正在运行");
    }
}
