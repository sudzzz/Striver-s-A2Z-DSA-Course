/*

*****
*   *
*   *
*   *
*****

*/

#include <bits/stdc++.h>
using namespace std;

void getStarPattern(int n) {
    // Write your code here
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==0||j==0||i==n-1||j==n-1){
                cout << "*";
            }else{
                cout << " ";
            }
        }
        cout << endl;
    }
}


int main() {
	// your code goes here
	int n;
	cin >> n;
	getStarPattern(n);
	return 0;
}
