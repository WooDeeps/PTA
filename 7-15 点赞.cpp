#include <iostream>
using namespace std;

int book[1001];

int main()
{   
    int n;
    cin >> n;
    int cishu = 0;         //被点赞最多的次数 
    int bianhao = 0;      //被点赞最多的编号
    
    for(int i = 0; i < n; i++) {
        int x;
        cin >> x;         //一行输入多少个数据  
        for(int j = 0; j < x; j++) {
            int data;
            cin >> data;       //输入数据编号
            book[data]++;      //同样的编号就累加
            if(book[data] > cishu) {
                cishu = book[data];
                bianhao = data;
            } else if(book[data] == cishu && data > bianhao) {  //并列的情况 
                cishu = book[data];
                bianhao = data;
            }
        }
    } 
    cout << bianhao << " " << cishu; 
    return 0; 
} 

