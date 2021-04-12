#include <bits/stdc++.h>
using namespace std;

typedef long long int ll;

ll min(ll x, ll y){
	if(x<y){
		return x;
	}
		return y;
}
		
int main(){
	ll ttt;
	cin>>ttt;
		
	while(ttt-- != 0){
		ll n,m,kk;
		cin >> n >> m >> kk;
		double MyMatrix[n+1][m+1];
		
		for(ll i=0;i<=n;i++){
			for(ll j=0;j<=m;j++){
				if(i==0 || j==0){
					MyMatrix[i][j]=0;
					}
				else{
					cin >> MyMatrix[i][j];
				}
			}
		}
		
		for(ll i=0;i<=n;i++){			
			for(ll j=0;j<=m;j++){
				cout << MyMatrix[i][j] << " ";
			}
			cout << endl;
		}
		cout << endl;
		
		for(ll i=0;i<=n;i++){
			double pre=0;
			for(ll j=0;j<=m;j++){
				MyMatrix[i][j]+=pre;
				pre=MyMatrix[i][j];
			}
		}
		
		for(ll i=0;i<=n;i++){			
			for(ll j=0;j<=m;j++){
				cout << MyMatrix[i][j] << " ";
			}
			cout << endl;
		}
		cout << endl;
		
		for(ll j=0;j<=m;j++){
			double pre=0;
			for(ll i=0;i<=n;i++){
				MyMatrix[i][j]+=pre;
				pre=MyMatrix[i][j];
			}
		}
		
		for(ll i=0;i<=n;i++){			
			for(ll j=0;j<=m;j++){
				cout << MyMatrix[i][j] << " ";
			}
			cout << endl;
		}
		cout << endl;
		
		ll zz = min(n,m);
		ll ans = 0;
		for(ll len=1;len<=zz;len++){
			for(ll i=len;i<=n;i++){
				for(ll j=len;j<=m;j++){
					if((MyMatrix[i][j]+MyMatrix[i-len][j-len]-MyMatrix[i][j-len]-MyMatrix[i-len][j])/(len*len)>=kk){
						ans++;
					}
				}
			}
		}
		cout << ans <<endl;
	}
}