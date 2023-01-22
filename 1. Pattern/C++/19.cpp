/*

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/

#include <bits/stdc++.h>
using namespace std;

void upperSymmetry(int n){
    int inital_spaces = 0;
    for(int i=0;i<n;i++){
        for(int j=1;j<=n-i;j++){
            cout << "*";
        }
        for(int j=0;j<inital_spaces;j++){
            cout << " ";
        }
        for(int j=1;j<=n-i;j++){
            cout << "*";
        }
        inital_spaces += 2;
        cout <<endl;
    }

}
void lowerSymmerty(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            cout << "*";
        }
        for(int j=1;j<=2*(n-i);j++){
            cout << " ";
        }
        for(int j=i;j>0;j--){
            cout << "*";
        }
        cout << endl;
    }

}


int main() {
	// your code goes here
	int n;
	cin >> n;
	upperSymmetry(n);
	lowerSymmerty(n);
	return 0;
}
