package cn.gdut.jianzhi;

public class Test17 {
    /**
     * 输出1到n的数，因为n可能会很大，直接用int或long会出现数组的溢出
     * 因此使用字符存储表示每一位数
     * @param n
     */
    public void  print1ToMaxOfNDigits(int n){
        if (n <= 0){
            return;
        }
        char [] number = new char[n];
        print1ToMaxOfNDigits(number,0);

    }
    private void print1ToMaxOfNDigits(char [] number, int digit){
        if (digit == number.length){
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10; i++){
            number[digit] = (char) (i + '0');
            print1ToMaxOfNDigits(number, digit+1);
        }
    }

    private void printNumber(char [] number){
        int index = 0;
        while (index < number.length && number[index] == '0') {

            index++;
        }
        while (index < number.length){
            System.out.print(number[index++]);
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Test17 test17 = new Test17();
        test17.print1ToMaxOfNDigits(3);
    }
}
