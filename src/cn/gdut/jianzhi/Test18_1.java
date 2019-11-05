package cn.gdut.jianzhi;

public class Test18_1 {
    /**
     * 时间复杂度为O(1)内删除，
     * +-
     * @param head
     * @param tobeDelete
     * @return
     */
    public ListNode deleteNode(ListNode head, ListNode tobeDelete){
        // 如果不是最后一个节点
        if (tobeDelete.next != null){
            tobeDelete.val = tobeDelete.next.val;
            tobeDelete.next = tobeDelete.next.next;
        }
        // 否则，
        else {
            // 只有一个节点，即头节点
            if (head == tobeDelete){
                head = null;
            }
            // 在最后一个节点，需要遍历到那个节点再将其删除
            else {
                ListNode cur = head;
                while (cur.next != tobeDelete){
                    cur = cur.next;
                }
                cur.next = null;
            }
        }
        return head;
    }
}
