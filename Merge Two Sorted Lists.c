/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* curr1=l1;
    struct ListNode* curr2=l2;
    if(l1==NULL&&l2!=NULL)
        return l2;
    if(l1!=NULL&&l2==NULL)
        return l1;
    if(l1==NULL&&l2==NULL)
        return NULL;
    struct ListNode* nhead=malloc(sizeof(struct ListNode));
    struct ListNode* curr=nhead;
    while(curr1!=NULL||curr2!=NULL)
    {
        if(curr1==NULL)
        {
            curr->next=curr2;
            return nhead->next;
        }
        else if(curr2==NULL)
        {
            curr->next=curr1;
            return nhead->next;
        }
        if(curr1->val<=curr2->val)
        {
            curr->next=curr1;
            curr1=curr1->next;
            curr=curr->next;
        }
        else{
            curr->next=curr2;
            curr2=curr2->next;
            curr=curr->next;
        }
    }
    return nhead->next;
}