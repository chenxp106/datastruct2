package cn.gdut.jianzhi;

public class Test8 {
    public TreeLinkNode GetNext(TreeLinkNode pNode){

        // 如果右子树不为空，则右子树的最左孩子即为下一个
        if (pNode.right != null){
            TreeLinkNode tmp = pNode.right;
            while (tmp.left != null){
                tmp= tmp.left;
            }
            return tmp;
        }
        // 右子树为空，
        else {
            while (pNode.next != null){
                // 找到父节点
                TreeLinkNode parent = pNode.next;
                // 当前节点是父节点的左孩子
                if (parent.left == pNode){
                    return parent;
                }
                pNode = parent;
            }
        }
        return null;
    }
}
