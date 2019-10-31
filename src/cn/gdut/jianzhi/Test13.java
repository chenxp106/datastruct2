package cn.gdut.jianzhi;

public class Test13 {

    private int [][] next = {{0,1},{0,-1},{-1,0},{1,0}};
    private int rows;
    private int cols;
    private int cnt = 0;
    private int threshold;
    public int movingCount(int threshold, int rows, int cols){
        //生成m*n矩阵
        int [][] matrix = new int[rows][cols];
        this.rows = rows;
        this.cols = cols;
        this.threshold = threshold;
        // 访问数组
        boolean [][] visited = new boolean[rows][cols];
        tracking(matrix, 0, 0, visited);
        return cnt;
    }

    private void  tracking(int [][] matrix, int r, int c, boolean [][] visited ){
        // 如果越界，并且已经访问。则跳出递归
        if (r < 0 || r >= rows || c < 0 || c >= cols || visited[r][c]){
            return;
        }

        //否则，标记访问
        visited[r][c] = true;
        // 如果大于thread，退出
        if (compute(r,c) > threshold){
            return;
        }
        // 否则，说明符合条件cnt++，继续向四周运算。
        cnt++;
        for (int [] n : next){
            tracking(matrix, r + n[0], c + n[1], visited);
        }
    }

    private int compute(int i, int j){
        int sum = 0;
        while (i > 0){
            sum += i % 10;
            i /= 10;
        }
        while (j > 0){
            sum += j % 10;
            j /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Test13 test13 = new Test13();
        System.out.println(test13.movingCount(5,10,10));
    }

}
