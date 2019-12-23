package cn.gdut.zuo.class3;

/**
 * @Desctiption 之字型打印矩阵
 * @Date 2019/12/23/023
 **/
public class Code08_zhiPrintMatrix {
    private static void zhiPrint(int [][] matrix){
        int aR = 0;
        int aC = 0;
        int bR = 0;
        int bC = 0;
        int endR = matrix.length - 1;
        int endC = matrix[0].length - 1;
        boolean fromUp = false;
        while (aR != endR + 1){
            printLevel(matrix, aR, aC, bR, bC, fromUp);
            aR = aC == endC ? aR + 1 : aR;
            aC = aC == endC ? aC : aC + 1;
            bR = bR == endR ? bR : bR + 1;
            bC = bR == endR ? bC + 1 : bC;
            fromUp = !fromUp;
        }
    }

    /**
     * 给两个点坐标，打印斜线矩阵
     * @param matrix
     * @param aR
     * @param aC
     * @param bR
     * @param bC
     */
    private static void printLevel(int [][] matrix, int aR, int aC, int bR, int bC, boolean fromUp){
        if (fromUp){
            while (aR != bR + 1){
                System.out.print(matrix[aR++][aC--] + " ");
            }
        }
        else {
            while (bR != aR - 1){
                System.out.print(matrix[bR--][bC++] + " ");
            }
        }
    }

    public static void printMatrixZigZag(int[][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = 0;
        int dC = 0;
        int endR = matrix.length - 1;
        int endC = matrix[0].length - 1;
        boolean fromUp = false;
        while (tR != endR + 1) {
            printLevel1(matrix, tR, tC, dR, dC, fromUp);
            tR = tC == endC ? tR + 1 : tR;
            tC = tC == endC ? tC : tC + 1;
            dC = dR == endR ? dC + 1 : dC;
            dR = dR == endR ? dR : dR + 1;
            fromUp = !fromUp;
        }
        System.out.println();
    }

    public static void printLevel1(int[][] m, int tR, int tC, int dR, int dC,
                                  boolean f) {
        if (f) {
            while (tR != dR + 1) {
                System.out.print(m[tR++][tC--] + " ");
            }
        } else {
            while (dR != tR - 1) {
                System.out.print(m[dR--][dC++] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        printMatrixZigZag(matrix);

    }

}

