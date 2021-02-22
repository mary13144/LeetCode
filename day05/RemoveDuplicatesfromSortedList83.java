package day05;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/15 23:09
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
        ListNode newlist = head.next;
        ListNode newhead = head;
        while (newlist!=null){
            if (newhead.val== newlist.val){
                newlist=newlist.next;
            }else {
                newhead.next=newlist;
                newlist=newlist.next;
                newhead=newhead.next;
            }
        }
        newhead.next=null;
        return head;

    }
}
