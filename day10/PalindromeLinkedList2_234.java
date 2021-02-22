package day10;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/21 2:48
 * @Version 1.0
 */
class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2() {}
    ListNode2(int val) { this.val = val; }
    ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
}
public class PalindromeLinkedList2_234 {
    public boolean isPalindrome(ListNode2 head) {
        ListNode2 fast = new ListNode2(0);
        ListNode2 slow = fast;
        fast.next=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if (fast!=null)
            slow=slow.next;
        slow=reserve(slow);
        fast=head;
        while (slow!=null){
            if (fast.val!=slow.val)
                return false;
            fast=fast.next;
            slow=slow.next;
        }
        return true;

    }
    ListNode2 reserve(ListNode2 head){
        if (head==null||head.next==null)
            return head;
        ListNode2 ans = reserve(head.next);
        head.next.next=head;
        head.next=null;
        return ans;
    }
}
