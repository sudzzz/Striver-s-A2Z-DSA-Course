/*

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

*/

#include <bits/stdc++.h>
using namespace std;

void nBinaryTriangle(int n) {
    // Write your code here.
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            cout << (i+j+1)%2 << " ";
        }
        cout << endl;
    }
}
int main() {
	// your code goes here
	int n;
	cin >> n;
	nBinaryTriangle(n);
	return 0;
}
