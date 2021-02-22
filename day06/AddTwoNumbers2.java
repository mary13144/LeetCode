package day06;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/17 2:14
 * @Version 1.0
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null&&l2==null)
            return null;
        if (l1==null&&l2!=null)
            return l2;
        if (l2==null&&l1!=null)
            return l1;
        ListNode newlist = new ListNode(0);
        ListNode newhead = newlist;
        int carry= 0;
        while (l1!=null || l2!=null){
            int x = l1==null?0:l1.val;
            int y = l2==null?0:l2.val;
            int sum = x + y + carry;
            carry=sum/10;
            sum=sum%10;
            newlist.next=new ListNode(sum);
            newlist=newlist.next;
            if (l1!=null)
                l1=l1.next;
            if (l2!=null)
                l2=l2.next;
        }
        if (carry==1)
            newlist.next = new ListNode(1);
        return newhead.next;

    }
}
