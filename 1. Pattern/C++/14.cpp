/*

A 
A B 
A B C 
A B C D 
A B C D E  

*/

#include <bits/stdc++.h>
using namespace std;

void nLetterTriangle(int n) {
    // Write your code here
    for(int i=0;i<n;i++){
        int letter = 65;
        for(int j=0;j<=i;j++){
            cout << (char)letter << " ";
            letter++;
        }
        cout << endl;
    }
}
int main() {
	// your code goes here
	int n;
	cin >> n;
	nLetterTriangle(n);
	return 0;
}
