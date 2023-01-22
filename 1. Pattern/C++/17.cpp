/*

     A     
    ABA    
   ABCBA   
  ABCDCBA  
 ABCDEDCBA 

*/

#include <bits/stdc++.h>
using namespace std;

void alphaHill(int n) {
    // Write your code here
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            cout << " ";
        }
        char letter = 'A';
        int breakpoint = (2*i+1)/2;
        for(int j=0;j<2*i+1;j++){
            cout << letter;
            if(j<breakpoint)
                letter++;
            else
                letter--;
        }
        for(int j=0;j<n-i-1;j++){
            cout << " ";
        }
        cout << endl;
    }
}
int main() {
	// your code goes here
	int n;
	cin >> n;
	alphaHill(n);
	return 0;
}
