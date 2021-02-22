package day10;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/22 0:53
 * @Version 1.0
 */
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class DeleteNodeinaLinkedList237 {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
