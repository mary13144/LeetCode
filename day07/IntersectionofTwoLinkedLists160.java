package day07;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/18 1:00
 * @Version 1.0
 */
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
    }
 }
public class IntersectionofTwoLinkedLists160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode la = headA;
        ListNode lb = headB;
        while (la!=lb){
            la = la == null?headB:la.next;
            lb = lb == null?headA:lb.next;
        }
        return la;
    }
}
