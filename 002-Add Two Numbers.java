/**
*You are given two non-empty linked lists representing two non-negative integers. 
*The digits are stored in reverse order and each of their nodes contain a single digit. 
*Add the two numbers and return it as a linked list.
*
*You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*
*Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
*Output: 7 -> 0 -> 8
**/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode prev=head;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
        	ListNode curr=new ListNode(0);
        	curr.val=(l1==null?0:l1.val)+(l2==null?0:l2.val)+carry;
        	carry=curr.val/10;
        	curr.val%=10;
        	prev.next=curr;
        	prev=curr;
        	l1=(l1==null?l1:l1.next);
        	l2=(l2==null?l2:l2.next);
        }
        return head.next;
    }
}