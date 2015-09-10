/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fakehead=new ListNode(0);
        ListNode fast=fakehead;
        ListNode slow=fakehead;
        fakehead.next=head;
        if(head==null||head.next==null)
            return null;
        while(n!=0){
            fast=fast.next;
            n--;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return fakehead.next;
    }
}