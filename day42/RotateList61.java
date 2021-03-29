package day42;
/**
 * @Author Mu Wenxin
 * @Date 2021/3/27 12:43
 * @Version 1.0
 */

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class RotateList61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null||head.next==null)
            return head;
        ListNode newhead = head;
        int i = 1;
        while (true){
            if (newhead.next!=null){
                newhead=newhead.next;
                i++;
            }else{
                newhead.next=head;
                break;
            }
        }
        k=k%i;
        int j = 1;
        while (j<=(i-k)){
            if (j==(i-k)){
                newhead=head.next;
                head.next=null;
                break;
            }else {
                head=head.next;
                j++;
            }
        }
        return newhead;
    }
}
