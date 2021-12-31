#include<iostream>
using namespace std;
#include <cmath>
#include <cstring>
#define maxe 1002 
#define N 1005
int a[N][N];
int main(){
	ios::sync_with_stdio(false);
	
	int t,n;
	cin>>t;
	memset(a,0,sizeof(a));
	a[1][1]  = 1;
	a[2][1] = 1;
	int s,plus = 0;
	for(int i = 3;i < N;i++){
		for(int j = 1;j < maxe;j++){
			s = a[i-2][j]+a[i-1][j]+plus;
			a[i][j] = s % 10;
			plus = s / 10;
		}
	}
	
	while(t--){
		int k = maxe;
		cin>>n;
		while(1){
			if(a[n][k])
			break;
			k--;
		}
		for(int i = k;i >= 1;i--){
			cout<<a[n][i];
		}
		cout<<endl;
	}
	
	return 0;
} 