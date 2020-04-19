package cn.gdut.jianzhi;

public class Test12 {

/*    private static int [][] next = {{-1,0},{1,0}, {0,-1},{0,1}};
    private int rows;
    private int cols;

    public boolean hasPath(char [] matrix, int rows, int cols, char [] str){
        this.rows = rows;
        this.cols = cols;
        // 定义访问的数组
        boolean [][]  visited = new boolean[rows][cols];
        // 将一维数组转化为二维数组
        char [][] array = build(matrix);
        // 回溯
        for (int i = 0 ;i < rows;i++){
            for ( int j = 0 ;j < cols;j++){
                // 如果成立，返回true
                if (tracking(array,i,j,0,str,visited)){
                    return true;
                }
            }
        }
        return false;
    }

    private char [][] build(char [] array){
        char [][] matrix = new char[rows][cols];
        for (int i = 0, k = 0;i < rows;i++){
            for (int j = 0 ; j < cols ;j++){
                matrix[i][j] = array[k++];
            }
        }
        return matrix;
    }

    private boolean tracking(char [][] matrix , int r, int c, int pathLen , char [] str, boolean [][] visited){
        // 递归出口
        if (str.length == pathLen){
            return true;
        }
        // 判断越界 值是不相等相等，被访问过。这些情况返回false，否则继续往下执行
        if (r < 0 || r >= rows || c < 0 || c >= cols || visited[r][c] || str[pathLen] != matrix[r][c]){
            return false;
        }
        // 标记访问
        visited[r][c] = true;
        // 四个方向遍历
        for (int [] n : next){
            if (tracking(matrix, r + n[0], c + n[1], pathLen+1, str, visited)){
                return true;
            }
        }
        // 标记未被访问
        visited[r][c] = false;
        return false;
    }*/

    private int [][] dir = {{-1,0},{1,0}, {0,-1},{0,1}};
    private int rows ;
    private int cols;
    private char [][] grid;
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        grid = new char[rows][cols];
        this.rows = rows;
        this.cols = cols;
        int index = 0;
        // 构建格子
        for (int i = 0; i < rows; i++){
            for (int j = 0; j< cols;j ++){
                grid[i][j] = matrix[index++];
            }
        }
        boolean [][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (tracking(str, visited, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean tracking(char [] str, boolean [][] visited, int i, int j, int len){
        if (len == str.length){
            return true;
        }
        if ( i < 0 || i >= rows || j < 0 || j >= cols || visited[i][j] || str[len] != grid[i][j]){
            return false;
        }
        visited[i][j] = true;
        for (int [] d : dir){
            if (tracking(str, visited, i + d[0], j + d[1] ,len+ 1)){
                return true;
            }
        }
        visited[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        Test12 test12 = new Test12();
        char [] a = {'A','B','C','E','S','F','C','S','A','D','E','E'};
        char [] str = {'S','E','E'};
        boolean res = test12.hasPath(a,3,4,str);
        System.out.println(res);
    }
}
