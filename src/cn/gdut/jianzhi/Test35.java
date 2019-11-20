package cn.gdut.jianzhi;

/**
 * @Desctiption 复杂链表的复制
 * @Date 2019/11/20/020
 **/
public class Test35 {
    public RandomListNode Clone(RandomListNode pHead){
        if (pHead == null){
            return null;
        }
        // 复制节点
        RandomListNode cur = pHead;
        // 插入新节点
        while (cur != null){
            RandomListNode node = new RandomListNode(cur.label);
            node.next = cur.next;
            cur.next = node;
            cur = node.next;
        }
        // 将随机指针赋值
        cur = pHead;
        while (cur != null){
            RandomListNode clone = cur.next;
            if (cur.random != null){
                clone.random = cur.random.next;
            }
            cur = clone.next;
        }
        // 拆分链表
        cur = pHead;
        RandomListNode pColne = cur.next;
        while (cur.next != null){
            //
            RandomListNode next = cur.next;
            // 往后指一个
            cur.next = next.next;
            // 将
            cur = next;
        }
        return pColne;

    }
}
