package cn.gdut.jianzhi;

/**
 * @Desctiption 二叉搜索树的后序遍历序列
 * @Date 2019/11/19/019
 **/
public class Test33 {
    public boolean VerfySquenceOfBST(int [] sequence){
        if (sequence.length == 0 || sequence == null){
            return false;
        }
        return isBST(sequence, 0, sequence.length - 1);
    }

    private boolean isBST(int [] sequence, int low, int high){
        // 出口
        if (high - low <= 1){
            return true;
        }
        // 根节点的值
        int root = sequence[high];
        // 找出左右子树的位置,i将左右子树分开
        int i = 0;
        while (sequence[i] < root){
            i++;
        }
        // 判断右子树是否满足
        int j = i;
        while (j < high){
            if (sequence[j] < root){
                return false;
            }
            j++;
        }
        // 递归左右子树
        return isBST(sequence, low, i-1 ) && isBST(sequence, i, high-1 );
    }

}
