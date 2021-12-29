#include<stdio.h>
#include<math.h>
int huiwen(int n)
{
	int sum=0;
	int i;
	for(i=n;i>0;i/=10)
	{
	sum=sum*10+i%10;	
	}
	if(sum==n)
	{
	return 1;//表示输出回文数
	}
	else
	{
	return 0;
	}
}
int sushu(int n)
{
if(n<2)
{
	return 0;
}
else
{
	for(int a=2;a<=sqrt(n);a++)//sqar为根号
	{
	if(n%a==0)
		return 0;			
	}
	return 1;//1在逻辑关系中表示为真，所以用return 1表示真的输出是素数
}	
}
int main()
{
	int n;
	while(scanf("%d",&n)!=EOF)//这里表示多组输入
	{
		if(n<100000&&huiwen(n)&&sushu(n))
		{
		printf("Yes\n");	
		}
		else
		{
			printf("No\n");
		}
	}
}