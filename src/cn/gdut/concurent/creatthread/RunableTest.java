package cn.gdut.concurent.creatthread;

public class RunableTest {
    public static void main(String[] args) {
        MyRunable myRunable = new MyRunable();
        Thread thread = new Thread(myRunable);
        thread.start();
    }
}
