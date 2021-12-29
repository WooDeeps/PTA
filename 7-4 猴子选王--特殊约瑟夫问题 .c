#include <stdio.h>
#include <stdlib.h>

struct linknode {
    int data;
    struct linknode *next;
    struct linknode *prior;
};

int main() {
    int n, m, k, i;
    scanf("%d %d %d", &n, &m, &k);
    struct linknode *p, *q, *g;
    p = (struct linknode *) malloc(sizeof(struct linknode));
    g = q = p;
    p->data = 1;
    p->next = p;
    for (i = 2; i <= n; i++) {
        q = (q->next = (struct linknode *) malloc(sizeof(struct linknode)));
        q->prior = g;//g用来存储上一个指针
        q->data = i;
        q->next = p;//新添加节点指向初始节点
        g = g->next;//将g指向新创建的节点
    }
    //将首元素的prior指针指向最后一个节点
    p->prior = g;
    //双向链表创建完毕
    q = p;
    //进行出队
    while (q != q->next)//当队列中不只剩一个人时进行出队
    {
        //首先顺指针出队
        for (i = 2; i < m; i++){
            q = q->next;
        }
        q->next = q->next->next;
        q->next->prior = q;//删除该节点

        //然后逆时针出队
        for (i = 2; i < k; i++){
            q = q->prior;
        }
        q->prior = q->prior->prior;
        q->prior->next = q;//删除该节点
    }
    printf("%d", q->next->data);
    return 0;
}