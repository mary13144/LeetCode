package day41;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/26 19:56
 * @Version 1.0
 */

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class RemoveDuplicatesfromSortedList83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null)
            return head;
        ListNode newhead = new ListNode();
        newhead.next=head;
        while (head.next!=null){
            if (head.val==head.next.val){
                head.next=head.next.next;
            }else
                head=head.next;
        }
        return newhead.next;
    }
}
