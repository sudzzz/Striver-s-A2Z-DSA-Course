/*

A B C D E 
A B C D 
A B C 
A B 
A 

*/

#include <bits/stdc++.h>
using namespace std;

void nLetterTriangle(int n) {
    // Write your code here
    for(int i=0;i<n;i++){
        char letter = 'A';
        for(int j=n-i;j>0;j--){
            cout << letter << " ";
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
