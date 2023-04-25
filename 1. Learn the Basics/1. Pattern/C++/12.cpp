/*

1        1
12      21
123    321
1234  4321
1234554321

*/

#include <bits/stdc++.h>
using namespace std;

void numberCrown(int n) {
    // Write your code here.
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            cout << j;
        }
        for(int j=1;j<=2*(n-i);j++){
            cout << " ";
        }
        for(int j=i;j>0;j--){
            cout << j;
        }
        cout << endl;
    }
}
int main() {
	// your code goes here
	int n;
	cin >> n;
	numberCrown(n);
	return 0;
}
