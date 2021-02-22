package day09;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/21 1:32
 * @Version 1.0
 */
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class PalindromeLinkedList234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> ans = new ArrayList<>();
        while (head!=null){
            ans.add(head.val);
            head=head.next;
        }
        int front = 0;
        int end = ans.size()-1;
        while (front<end){
            if (ans.get(front).equals(ans.get(end))){
                front++;
                end--;
            }else
                return false;
        }
        return true;
    }
}
