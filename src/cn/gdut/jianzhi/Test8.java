package cn.gdut.jianzhi;

public class Test8 {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        // 如果有右子树，则直接指向右孩子,的最左子节点
        if (pNode.right != null){
            TreeLinkNode t = pNode.right;
            while (t.left != null){
                t = t.left;
            }
            return t;
        }
        // 否则,向上找第一个左链表指向树包含该节点的祖先节点
        else {
            while (pNode.next != null){
                TreeLinkNode parent = pNode.next;
                if (parent.left == pNode){
                    return parent;
                }
                pNode = pNode.next;
            }
        }
        return null;

    }
}
