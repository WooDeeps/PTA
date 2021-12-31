#include<stdio.h>
#include<string.h>
int check(char a[],int i,int j)
{
    while(i<j)
    {
        if(a[i++]!=a[j--])
        return 0;
    }
    return 1;

}
int main()
{
    char a[20000];
    fgets(a,20000,stdin);
    int i,j,max_i=-1,max_j=-1,str=strlen(a);
    for(i=0;i<str;i++)
    {
        for(j=str;j>=i;j--)
        {
            if(check(a,i,j))
            {
                if(j-i>max_j-max_i)
                {
                   max_j=j;
                   max_i=i;
                }
                break;
            }
        }
    }
    a[max_j+1]=0;
    printf("%d\n",max_j+1-max_i);
    return 0;
 }