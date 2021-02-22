package day08;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/19 21:24
 * @Version 1.0
 */
 class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}
    ListNode1(int val) { this.val = val; }
    ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}
public class three {
    public ListNode1 removeElements(ListNode1 head, int val) {
        if (head==null)
            return null;
        ListNode1 newlist = new ListNode1(0);
        newlist.next=head;
        ListNode1 newhead = newlist;
        while (newlist.next!=null){
            if (newlist.next.val==val)
                newlist.next=newlist.next.next;
            else
                newlist=newlist.next;
        }
        return newhead.next;
    }
    //递归
    public ListNode1 removeElements1(ListNode1 head, int val) {
        if(head==null)
            return null;
        head.next=removeElements1(head.next,val);
        if(head.val==val){
            return head.next;
        }else{
            return head;
        }
    }
}
