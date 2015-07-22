/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 /*遍历一次*/
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *p1=l1,*p2=l2;
    struct ListNode *l3=NULL,*p3=NULL;
    int sum=0;
    l3=malloc(sizeof(struct ListNode));
    l3->next=NULL;
    p3=l3;
    while(p1!=NULL||p2!=NULL)
    {
        sum/=10;/*用来处理进位*/
        if(p1!=NULL)
        {
            sum+=p1->val;
            p1=p1->next;
        }
        if(p2!=NULL)
        {
            sum+=p2->val;
            p2=p2->next;
        }
        p3->next=malloc(sizeof(struct ListNode));
        p3=p3->next;
        p3->val=sum%10;
        p3->next=NULL;
    }
    if(sum/10!=0)
    {
        p3->next=malloc(sizeof(struct ListNode));
        p3=p3->next;
        p3->val=1;
        p3->next=NULL;
    }
    return l3->next;
}
