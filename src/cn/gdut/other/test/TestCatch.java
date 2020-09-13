package cn.gdut.other.test;

public class TestCatch {
    public static void main(String[] args) {
        try {
            int i = 1/0;
        }catch (Exception w){
            w.printStackTrace();
            return;
        }finally {
            System.out.println("finally");
        }
    }
}
