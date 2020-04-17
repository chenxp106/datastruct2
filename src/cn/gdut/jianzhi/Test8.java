package cn.gdut.jianzhi;

public class Test8 {
    public TreeLinkNode GetNext(TreeLinkNode pNode){

/*        // 如果右子树不为空，则右子树的最左孩子即为下一个
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
        return null;*/

        // 如果右子树不为空，则下一个节点为右子树的最左的左孩子
        if (pNode.right != null){
            TreeLinkNode temp = pNode.right;
            while (temp.left != null){
                temp = temp.left;
            }
            return temp;
        }
        // 右子树为空。往回找。找到第一个节点为左孩子为止
        else {
            while (pNode.next != null){
                TreeLinkNode parent = pNode.next;
                if (parent.left == pNode){
                    return parent;
                }
                pNode = parent;
            }
        }
        return null;

    }
}
