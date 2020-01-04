package cn.gdut.zuo.class8;

/**
 * @Desctiption 汉诺塔问题
 * @Date 2020/1/4/004
 **/
public class Code01_Hanio {

    public static void process(int N, String from ,String to, String help){
        // 只有一个盘子，直接从from移动到to中
        if (N == 1){
            System.out.println("移动1从" + from + "到" + to );
        }
        else {
            // 将N-1个盘子从from,移动到help中，借助to
            process(N-1, from, help, to);
            // 将from中的一个盘子移动到to中
            System.out.println("移动" + N + "从" + from + "到" + to);
            // 将help中的值借助from，移动到to中
            process(N-1,help, to,from);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        process(10, "左","右","中");
    }
}
