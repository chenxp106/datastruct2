package cn.gdut.zuo.class3;

import cn.gdut.zuo.utils.Node;

/**
 * @Desctiption 在一个链表中，将链表划分为3个部分，小于的在左边，等于的在中间，大于的在右边
 * @Date 2019/12/24/024
 **/
public class Code12_SmallerEqualBigger {

    /**
     * 第一种方法，准备一个数组，用荷兰国旗问题
     * 1、将链表中的值复制到数组中
     * 2、在数组中用荷兰国旗问题
     * 3、将数组中的值赋值回链表中
     * @param head
     * @param pivot
     * @return
     */
    public static Node listPartition(Node head, int pivot){
        if (head == null){
            return null;
        }
        // 统计个数用于开辟数组的空间
        Node cur = head;
        int i = 0;
        while (cur != null){
            i++;
            cur = cur.next;
        }
        Node [] nodeArr = new Node[i];
        i = 0;
        // 将链表的节点赋值到数组中
        cur = head;
        while (cur != null){
            nodeArr[i] = cur;
            cur = cur.next;
        }
        // 在数组中排序
        arrPartiton(nodeArr, pivot);

        // 将数组中的值赋值回去
        for (i = 0;i != nodeArr.length ;i++){
            nodeArr[i-1].next = nodeArr[i];
        }
        nodeArr[i-1].next = null;
        return nodeArr[0];

    }

    private static void arrPartiton(Node [] nodeArr, int pivot){
        int small = -1;
        int big = nodeArr.length;
        int cur = 0;
        while (cur != big){
            // 小的话，small右移
            if (nodeArr[cur].val < pivot){
                swap(nodeArr, ++small, cur++);
            }
            else if (nodeArr[cur].val == pivot){
                cur++;
            }
            else {
                swap(nodeArr, --big, cur);
            }
        }
    }

    private static void swap(Node [] nodeArr, int i, int j){
        Node tmp = nodeArr[i];
        nodeArr[i] = nodeArr[j];
        nodeArr[j] = tmp;
    }

    /**
     * 第二种方法，空间复杂度O(1), 时间复杂度O(n)
     * 1、第一次遍历，找到三个值。建立三个变量，分别存储小的，相等，大的
     * 2、遍历，将每个值分别放到对应的桶上
     * 3、在将三个桶头尾连接起来。
     * @param head
     * @param pivot
     * @return
     */
    public static Node listPartion2(Node head, int pivot){
        // 6个变量，分别存储一个桶的头尾节点
        Node sH = null;
        Node sE = null;
        Node eH = null;
        Node eE = null;
        Node bH = null;
        Node bE = null;

        //用于保存下一个节点
        Node next = null;

        while (head != null){
            // 将一个节点分割开来
            next = head.next;
            head.next = null;
            if (head.val < pivot){
                if (sH == null){
                    sH = head;
                    sE = head;
                }
                else {
                    sE.next = head;
                    sE = head;
                }
            }
            else if (head.val == pivot){
                // 如果为空，将值放到对应的桶中
                if (eH == null){
                    eH = head;
                    eE = head;
                }
                // 不为空，则接在后面
                else {
                    eE.next = head;
                    eE = head;
                }
            }
            else {
                // 如果为空，将值放到对应的桶中
                if (bH == null){
                    bH = head;
                    bE = head;
                }
                // 不为空，则接在后面
                else {
                    bE.next = head;
                    bE = head;
                }
            }
            // 下移一个
            head = next;

        }
        // 小的和相等的相连
        // 说明小的没有节点
        if (sH == null){
            sE.next = eH;
            eE = eE == null ? sE : eE;
        }
        if (eE != null){
            eE.next = bH;
        }
        return sH != null ? sH : eH != null ? eH : bH;
    }
}
