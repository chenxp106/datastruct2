package cn.gdut.jianzhi;

public class Test4 {
    public boolean Find(int target, int [][] array){
/*        int row = array.length;
        int col = array[0].length;
        int i = 0;
        int j = col-1;
        while (i<row && j>=0){
            if (target == array[i][j]){
                return true;
            }
            else if (target < array[i][j]){
                j--;
            }
            else {
                i++;
            }
        }
        return false;*/
        int row = array.length -1 ;
        int i = 0, j = array[0].length - 1;
        while (i <= row && j >= 0){
            if (array[i][j] == target){
                return true;
            }
            else if (array[i][j] < target){
                i++;
            }
            else {
                j--;
            }
        }
        return false;
    }
}
