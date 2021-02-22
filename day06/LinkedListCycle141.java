package day06;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/17 0:49
 * @Version 1.0
 */

class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int x) {
        val = x;
        next = null;
    }
}
public class LinkedListCycle141 {
    public boolean hasCycle(ListNode1 head) {
        if (head==null||head.next==null)
            return false;
        ListNode1 slow = head;
        ListNode1 fast = head.next;
        while (slow!=fast){
            if (fast==null||fast.next==null)
                return false;
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
}
