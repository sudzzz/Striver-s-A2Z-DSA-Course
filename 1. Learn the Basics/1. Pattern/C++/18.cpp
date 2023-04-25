/*

E 
D E 
C D E 
B C D E 
A B C D E 

*/

#include <bits/stdc++.h>
using namespace std;

void alphaTriangle(int n) {
    // Write your code here
    int letter = 65+n-1;
    for(int i=0;i<n;i++){
        char ch = (char)letter;
        for(int j=0;j<=i;j++){
            cout << ch << " ";
            ch++;
        }
        letter--;
        cout << endl;
    }
}
int main() {
	// your code goes here
	int n;
	cin >> n;
	alphaTriangle(n);
	return 0;
}
