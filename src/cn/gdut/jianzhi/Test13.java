package cn.gdut.jianzhi;

public class Test13 {
/*    private int [][] next = {{0,1},{0,-1},{-1,0},{1,0}};
    private  int rows;
    private  int cols;
    private  int threshold;
    private int cnt = 0;
    public int movingCount(int threshold, int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.threshold = threshold;
        // 构建一个二维数组
        int [][] matrix = new int[rows][cols];
        // 标记数组
        boolean [][] visited = new boolean[rows][cols];
        tracking(visited,0,0);
        return cnt;
    }

    *//**
     * 递归遍历，即dfs，深度遍历
     * @param visited
     * @param r
     * @param c
     *//*
    private void tracking(boolean [][] visited, int r, int c){
        // 如果越界，或是被访问过
        if (r < 0 || r >= rows || c < 0 || c >= cols || visited[r][c]){
            return;
        }
        // 如果值小于阈值
        if (compute(r,c) > threshold){
            return;
        }
        cnt++;
        // 标记访问过
        visited[r][c] = true;
        // 继续向四周遍历
        for (int [] n : next){
            tracking(visited, r + n[0], c + n[1]);
        }
    }

    *//**
     * 计算坐标对应的和
     * @param i
     * @param j
     * @return
     *//*
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
    }*/

    private int threshold;
    private int rows;
    private int cols;
    private int cnt;
    private int [][] dir = {{0,1},{0,-1},{-1,0},{1,0}};
    public int movingCount(int threshold, int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        this.threshold = threshold;
        int [][] grid = new int[rows][cols];
        boolean [][] visited = new boolean[rows][cols];
        tracking(visited, 0,0);
        return cnt;
    }

    private void tracking(boolean [][] visited, int i, int j){
        // 如果越界
        if (i < 0 || i >= rows || j < 0 || j >= cols || visited[i][j]){
            return;
        }
        if (compute(i, j) > threshold){
            return;
        }
        cnt++;
        // 标记访问
        visited[i][j] = true;
        for (int [] d : dir){
            tracking(visited, i + d[0], j + d[1]);
        }

    }

    private int compute(int i,int j){
        int res = 0;
        while (i != 0){
            res += i % 10;
            i = i/ 10;
        }
        while (j != 0){
            res += j % 10;
            j = j / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Test13 test13 = new Test13();
        System.out.println(test13.movingCount(5,10,10));
    }

}
