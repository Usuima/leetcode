/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null)
            return head;
        ListNode head1=new ListNode(0);
        ListNode head2=new ListNode(0);
        ListNode cur1=head1;
        ListNode cur2=head2;
        ListNode cur=head;
        while(cur!=null)
        {
            if(cur.val<x)
            {
                cur1.next=cur;
                cur1=cur1.next;
            }
            if(cur.val>=x)
            {
                cur2.next=cur;
                cur2=cur2.next;
            }
            cur=cur.next;
        }
        cur2.next=null;//attention!!!!否则有可能出现循环
        cur1.next=head2.next;
        return head1.next;
    }
}
