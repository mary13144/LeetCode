package day10;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/21 2:26
 * @Version 1.0
 */
class ListNode1 {
     int val;
     ListNode1 next;
     ListNode1() {}
     ListNode1(int val) { this.val = val; }
     ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}
public class PalindromeLinkedList1_234 {
    ListNode1 front ;
    public boolean isPalindrome(ListNode1 head) {
        front=head;
        return checklistnode(head);
    }
    boolean checklistnode(ListNode1 head){
        if (head==null){
            return true;
        }
        boolean ans = checklistnode(head.next)&&(front.val==head.val);
        front=front.next;
        return ans;
    }
}
