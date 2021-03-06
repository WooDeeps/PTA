#include<iostream>
#include<cstring>
#include<algorithm>
using namespace std;
const int L=110;
string add(string a,string b)//只限两个非负整数相加
{
    string ans;
    int na[L]={0},nb[L]={0};
    int la=a.size();
    int lb=b.size();
    // 倒叙存储
    for(int i=0;i<la;i++)
        na[la-1-i]=a[i]-'0';
    // 倒叙存储
    for(int i=0;i<lb;i++)
        nb[lb-1-i]=b[i]-'0';
    int lmax=la>lb?la:lb;
    // 从个位开始计算
    for(int i=0;i<lmax;i++)
    {
        na[i]+=nb[i];
        na[i+1]+=na[i]/10;
        na[i]%=10;
    }
    // 去除前置0
    if(!na[lmax])
        lmax--;
    for(int i=lmax;i>=0;i--)
        ans+=na[i]+'0';
    return ans;
}
int main()
{
    string a,b;
    int count;
    cin>>count;
    for (int i = 0; i < count; ++i) {
        while(cin>>a>>b)
            cout<<add(a,b)<<endl;
    }
    return 0;
}