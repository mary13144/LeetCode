package day03;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/13 22:15
 * @Version 1.0
 */

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode out =new ListNode(0);
        ListNode l3 = out;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
               l3.next=l1;
               l1=l1.next;
               l3=l3.next;
            }else {
                l3.next=l2;
                l2=l2.next;
                l3=l3.next;
            }
        }
        if (l1==null){
            l3.next=l2;
        }else {
            l3.next=l1;
        }
        return out.next;

    }

}
