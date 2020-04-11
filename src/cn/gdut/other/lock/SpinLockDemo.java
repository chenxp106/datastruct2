package cn.gdut.other.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @ClassName SpinLockDemo
 * @Desctiption 实现一个自旋锁
 * @Date 2020/4/11 15:54
 */
public class SpinLockDemo {

    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void myLock() {
        Thread thread = Thread.currentThread();
        System.out.println(Thread.currentThread() + "comin ");

        while ( !atomicReference.compareAndSet(null, thread)){

        }
        System.out.println(Thread.currentThread().getName() + "在循环 ");
    }

    public void myUnlock() {
        Thread thread = Thread.currentThread();
        atomicReference.compareAndSet(thread, null);
        System.out.println(Thread.currentThread().getName() + "\t invoke myUnlock");
    }

    public static void main(String[] args) {
        SpinLockDemo spinLockDemo = new SpinLockDemo();
        new Thread(() -> {
            spinLockDemo.myLock();
            try {
                TimeUnit.SECONDS.sleep(5);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            spinLockDemo.myUnlock();
        },"aaa").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        new Thread(() -> {
            spinLockDemo.myLock();
            try {
                TimeUnit.SECONDS.sleep(5);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            spinLockDemo.myUnlock();
        },"bbb").start();

    }
}





















