package cn.gdut.jianzhi;

public class Test17 {
    /**
     * 输出1到n的数，因为n可能会很大，直接用int或long会出现数组的溢出
     * 因此使用字符存储表示每一位数
     * @param n
     */
    public void  print1ToMaxOfNDigits(int n){
        if (n < 0){
            return;
        }
        // 定义存储的字符数组
        char [] numbers = new char[n];
        print1ToMaxOfNDigits(numbers,0);

    }

    private void print1ToMaxOfNDigits(char [] numbers, int digits){
        if (numbers.length == digits){
            printNumber(numbers);
            return;
        }
        for (int i = 0;i < 10 ;i++){
            numbers[digits] = (char)(i + '0');
            print1ToMaxOfNDigits(numbers, digits+1);
        }
    }

    private void printNumber(char[] numbers){
        int index = 0;
        while (index < numbers.length && numbers[index] == '0'){
            index++;
        }
        while (index < numbers.length){
            System.out.print(numbers[index++]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Test17 test17 = new Test17();
        test17.print1ToMaxOfNDigits(5);
    }
}
