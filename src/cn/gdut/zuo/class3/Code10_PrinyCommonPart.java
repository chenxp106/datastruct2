package cn.gdut.zuo.class3;

import cn.gdut.zuo.utils.Node;

/**
 * @Desctiption d0
 * @Date 2019/12/24/024
 **/
public class Code10_PrinyCommonPart {

    public static void printCommonPart(Node head1, Node head2){
        while (head1 != null && head2 != null){
            if (head1.val < head2.val){
                head1 = head1.next;
            }
            else if (head1.val > head2.val){
                head2 = head2.next;
            }
            else {
                System.out.println(head1.val);
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }
}
