#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t,N,K;
	string s;

	cin >> t;
	
	for(int i=0;i<t;i++)
	{
		cin >> N >> K >> s;
		string seq(K,'*');
		//cout << N << " " << K << " " << s << " " << seq << endl;
		
		if(s.find(seq) != std::string::npos){
			cout << "YES" << endl;
		}
		else
		{
			cout << "NO" << endl;
		}
	}
	return 0;
}
