package day08;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/19 23:31
 * @Version 1.0
 */
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class ReverseLinkedList206 {
     //迭代
    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null)
            return null;
        ListNode pre = null;
        ListNode last = head.next;
        while (head.next!=null){
            head.next=pre;
            pre=head;
            head=last;
            last=head.next;
        }
        head.next=pre;
        return head;
    }
    //递归
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

}
