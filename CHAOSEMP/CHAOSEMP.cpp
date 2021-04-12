#include <bits/stdc++.h>
using namespace std;
#define ll long long

int main(){
	
	int t,q,d;
	cin >> t >> q >> d;
	
	while(t--)
	{
		ll l = (-1LL)*2e18,r=2e18,y1=1,y2=r;
		ll curr = 1LL;
		string cc;
		
		ll mid = (l + r)/2;
		
		while(l <= r)
		{
			mid = (l + r)/2;
			if(curr == 1LL0