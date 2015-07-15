
//相加+计算进位
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *p=l1,*q=l2,*newNode=NULL,*l3=NULL,*r=NULL;
    int n=0,m=0;
    while(p!=NULL)
    {
   		p=p->next;
   		n++;
   	}
   	while(q!=NULL)
   	{
   		q=q->next;
   		m++;
   	}
    l3=malloc(sizeof(struct ListNode));
    r=l3;
   	for (p=l1,q=l2;n!=0||m!=0; )
   	{
   		newNode=malloc(sizeof(struct ListNode));
   		if(m==0)
   		{
   			newNode->val=p->val;
   			n--;
            p=p->next;
   		}
   		else if(n==0)
   		{
   			newNode->val=q->val;
   			m--;
            q=q->next;
   		}
   		else{
   			newNode->val=q->val+p->val;
   			m--;
   			n--;
            p=p->next;
            q=q->next;
   		}
   		r->next=newNode;
   		r=r->next;
   	}
   	r->next=NULL;
   	l3=l3->next;
    r=l3;
   	while(r!=NULL)
   	{
   		if(r->val>=10)
   		{
   			r->val=r->val-10;
   			if(r->next!=NULL)
   			{
   				r->next->val++;
   			}
   			else{
   				newNode=malloc(sizeof(struct ListNode));
   				newNode->val=1;
   				newNode->next=NULL;
   				r->next=newNode;
   			}
   		}
   		r=r->next;
   	}
   	return l3;
}
