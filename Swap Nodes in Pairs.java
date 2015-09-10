/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode fakehead=new ListNode(0);
        fakehead.next=head;
        
        for(ListNode curr=fakehead;curr.next!=null&&curr.next.next!=null;curr=curr.next.next)
        {
            curr.next=swap(curr.next,curr.next.next);
        }
        return fakehead.next;
    }
    private ListNode swap(ListNode node1,ListNode node2)
    {
        node1.next=node2.next;
        node2.next=node1;
        return node2;
    }
}