package cn.gdut.bishi;

public class Test582 {
    public int question (int a, int b) {
        int i = 1;
        for (; i < 500; i++){
            if (lowIsSquare(i+a) && lowIsSquare(i+b)){
                return i;
            }
        }
        return i;
    }

    private boolean lowIsSquare(int num){
        if (num < 0){
            return false;
        }
        for (int i = 1; num > 0; i+=2){
            num -= i;

        }
        return 0 == num;
    }
}
