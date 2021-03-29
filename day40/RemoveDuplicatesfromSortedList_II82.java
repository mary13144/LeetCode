package day40;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/25 16:16
 * @Version 1.0
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class RemoveDuplicatesfromSortedList_II82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null)
            return head;
        ListNode ans = new ListNode();
        ans.next=head;
        ListNode newhead = head;
        ListNode prehead = ans;
        while (newhead.next!=null){
            if (newhead.val==newhead.next.val){
                while (newhead.next!=null&&newhead.val==newhead.next.val){
                    newhead.next=newhead.next.next;
                }
                newhead=prehead.next.next;
                prehead.next=newhead;
                if (newhead==null)
                    return ans.next;
            }else {
                prehead=prehead.next;
                newhead=newhead.next;
            }
        }
        return ans.next;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedList_II82 test = new RemoveDuplicatesfromSortedList_II82();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        test.deleteDuplicates(head);
    }
}
