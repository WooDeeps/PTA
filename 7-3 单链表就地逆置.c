#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
int main()
{
    int count;
    scanf("%d",&count);
    while(count--){
        struct node *head,*p,*q;
        int x;
        head=(struct node *)malloc(sizeof(struct node));
        head->next=NULL;
        while(~scanf("%d",&x))//输入
        {
            if(x==-1)
                break;
            else
            {
                p=(struct node *)malloc(sizeof(struct node));//
                p->data=x;//赋值
                p->next=head->next;//p所指向的结点插入头结点之后
                head->next=p;
            }
        }
        q=head->next;
        while(q)//输出
        {
            if(q->next==NULL)
                printf("%d\n",q->data);
            else
                printf("%d ",q->data);
            q=q->next;
        }
    }
    return 0;
}

