/*
    *    
   ***   
  *****  
 ******* 
*********
*********
 ******* 
  *****  
   ***   
    *
*/

#include <bits/stdc++.h>
using namespace std;

void lowerNTriangle(int n){
    for(int i=0;i<n;i++){
		    //Space = i
		    for(int j=0;j<i;j++){
		        cout << " ";
		    }
		     //Star -> 2n - (2i+1)
		    for(int j=0;j<(2*n-(2*i+1));j++){
		        cout << "*";
		    }
		     //Space
		    for(int j=0;j<i;j++){
		        cout << " ";
		    }
		    cout << endl;
	}
}

void upperNTriangle(int n){
    for(int i=0;i<n;i++){
            for(int j=n-i-1;j>0;j--){
                cout << " ";
            }
            for(int j=0;j<2*i+1;j++){
                cout << "*";
            }
            for(int j=n-i-1;j>0;j--){
                cout << " ";
            }
            cout << endl;
        }
}

int main() {
	// your code goes here
	int n;
	cin >> n;
	upperNTriangle(n);
	lowerNTriangle(n);
	return 0;
}
