package cn.gdut.zuo.class4;

import cn.gdut.zuo.utils.TreeNode;

/**
 * @Desctiption 判断是否为平衡二叉树
 * @Date 2019/12/27/027
 **/
public class Code06_IsBalancedTree {

    public static class ResultBase{
        boolean isB;
        int  h;
        public ResultBase(boolean isB, int h){
            this.isB = isB;
            this.h = h;
        }
    }

    public ResultBase isB(TreeNode head){
        if (head == null){
            return new ResultBase(false, 0);
        }
        ResultBase leftB = isB(head.left);
        if (!leftB.isB){
            return new ResultBase(false, 0);
        }
        ResultBase rightB = isB(head.right);
        if (!rightB.isB){
            return new ResultBase(false, 0);
        }
        if (Math.abs(leftB.h - rightB.h) > 1){
            return new ResultBase(false, 0);
        }
        return new ResultBase(true, Math.max(leftB.h, rightB.h) + 1);

    }

}
