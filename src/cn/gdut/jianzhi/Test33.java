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

    private boolean isBST(int [] sequence, int l, int h){
        if (l >= h){
            return true;
        }
        int last = sequence[h];
        int i = l;
        while (i < h){
            if (sequence[i] > last){
                break;
            }
            i++;
        }
        // 标记中间
        int cur = i;
        while (i < h){
            if (sequence[i] < last){
                return false;
            }
            i++;
        }
        return isBST(sequence, l, cur - 1) && isBST(sequence, cur, h- 1);
    }

    public static void main(String[] args) {
        Test33 test33 = new Test33();
        System.out.println(test33.VerfySquenceOfBST(new int[]{1,3,2,5,4}));
    }


}
