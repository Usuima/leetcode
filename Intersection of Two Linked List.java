/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1=headA;
        ListNode cur2=headB;
        if(headA==null||headB==null)
            return null;
        while(cur1!=cur2)
        {
            cur1=cur1.next;
            cur2=cur2.next;
            if(cur1==cur2)
                return cur1;//可以检测出没有交汇的情况
            if(cur1==null)
                cur1=headB;
            if(cur2==null)
                cur2=headA;
        }
        return cur1;
    }
}
