package cn.gdut.bishi;

import java.util.Scanner;

public class xiaomi2 {

    static int [][] dir = {{1,0}, {-1,0}, {0,-1}, {0,1}};

    static int m, n;
    public static void main(String[] args) {
        char [][]  a = {};
        Scanner sc = new Scanner(System.in);
        String trim = sc.nextLine().trim();

        int i = 0;
        while (sc.hasNextLine()){
            String trim1 = sc.nextLine().trim();
            String[] s = trim1.split(" ");
            for (int j = 0; j < s.length; j++){
                i++;
            }

        }

        System.out.println(exit(a, trim));


    }

    private static boolean exit(char [][] board, String word){
        if (word == null || word.length() == 0){
            return true;
        }
        m = board.length;
        n = board[0].length;
        char [] array = word.toCharArray();
        boolean [][] visit = new boolean[m][n];

        for (int i = 0; i  < m; i++){
            for (int j = 0; j < n ;j++){
                if (tracking(board, array, 0,i,j,visit)){
                    return true;
                }
            }
        }
        return false;

    }

    private static boolean tracking(char [][] board, char [] array, int curLen, int i, int j, boolean [][] visit){
        if (curLen == array.length){
            return true;
        }
        // 判断越界
        if (i < 0 || i >= m || j < 0 || j >= n || visit[i][j] || board[i][j]   != array[curLen]){
            return false;
        }

        visit[i][j] = true;
        for (int [] d : dir){
            if (tracking(board, array, curLen, i + d[0], j + d[1], visit)){
                return true;
            }
        }
        visit[i][j] = false;
        return true;
    }


}
