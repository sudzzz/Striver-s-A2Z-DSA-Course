/*

*
**
***
****
*****
****
***
**
*

*/

#include <bits/stdc++.h>
using namespace std;


void nStarTriangle(int n) {
    // Write your code here
    for(int i=0;i<2*n-1;i++){
        if(i<n){
            for(int j=0;j<=i;j++){
                cout << "*";
            }
        }else{
            for(int j=i;j<2*n-1;j++){
                cout << "*";
            }
        }
        cout << endl;
    }
}

int main() {
	// your code goes here
	int n;
	cin >> n;
	nStarTriangle(n);
	return 0;
}
