package cn.gdut.leetcode.tracking;

/**
 * @ClassName ReenterLockDemo
 * @Desctiption 可重入锁
 * 同一线程的外层函数获得锁后，内层递归函数仍然能获取该锁的代码
 * 在同一个线程在外层方法获取锁的时候，在进入内层方法会自动获取锁
 *
 * 也就是说，线程可以进入任何一个它已经拥有的锁的同步代码块。
 * @Date 2020/4/11 15:16
 */
class Phone{
    public synchronized void sendEmail() throws Exception{
        System.out.println(Thread.currentThread().getId() + "\t invoke SMS");
    }
    public synchronized void sendSMS() throws Exception{
        System.out.println(Thread.currentThread().getId() + "\t ####### invoke sendEmail");
        sendEmail();
    }
}

public class ReenterLockDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        new Thread( () -> {
            try {
                phone.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "t1").start();

        new Thread( () -> {
            try {
                phone.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "t2").start();
    }
}


































