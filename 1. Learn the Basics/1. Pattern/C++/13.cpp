/*

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/

#include <bits/stdc++.h>
using namespace std;

void nNumberTriangle(int n) {
    // Write your code here
    int num = 1;
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            cout << num++ << " ";
        }
        cout << endl;
    }
}
int main() {
	// your code goes here
	int n;
	cin >> n;
	nNumberTriangle(n);
	return 0;
}
