package cn.gdut.jianzhi;

/**
 * @Desctiption TODO
 * @Date 2019/11/19/019
 **/
public class Test33 {
    public boolean VerfySquenceOfBST(int [] sequence){

        if (sequence == null || sequence.length == 0){
            return false;
        }
        return isVerfy(sequence, 0, sequence.length -1);
    }

    // 递归
    private boolean isVerfy(int [] sequence, int low, int last){
        // 出口
        if (last - low <= 1){
            return true;
        }
        // 最后一个值
        int rootVal = sequence[last];
        int i = low;
        while ( i < last &&sequence[i] <= sequence[last]){
            i++;
        }
        // 判断右子树是否符合
        for (int j = i ;j < last ;j++){
            if (sequence[j] < rootVal){
                return false;
            }
        }
        // 递归
        return isVerfy(sequence, low, i-1) && isVerfy(sequence, i+1, last);

    }

}
