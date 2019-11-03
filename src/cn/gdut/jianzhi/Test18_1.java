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
        // 末尾有节点并且head不是toDelete节点
        if (tobeDelete.next != null ){
            tobeDelete.val = tobeDelete.next.val;
            tobeDelete.next = tobeDelete.next.next;
        }
        else {
            // 只有一个节点
            if (head == tobeDelete){
                head = null;
            }
            else {
                //如果toDelete是末尾节点。需要找到最后一个节点再删
                ListNode tmp = head;
                if (tobeDelete.next == null){
                    while (tmp.next != tobeDelete){
                        tmp = tmp.next;
                    }
                    tmp.next = null;
                }

            }

        }

        // 返回头结点
        return head;
    }
}
