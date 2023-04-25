/*

A 
B B 
C C C 
D D D D 
E E E E E 

*/

#include <bits/stdc++.h>
using namespace std;

void alphaRamp(int n) {
    // Write your code here
    char letter = 'A';
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            cout << letter << " ";
        }
        letter++;
        cout << endl;
    }
}
int main() {
	// your code goes here
	int n;
	cin >> n;
	alphaRamp(n);
	return 0;
}
