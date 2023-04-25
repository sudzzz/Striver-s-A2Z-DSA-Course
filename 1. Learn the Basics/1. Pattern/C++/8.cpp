/*
*********
 ******* 
  *****  
   ***   
    *
*/

#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	for(int i=0;i<5;i++){
		    //Space = i
		    for(int j=0;j<i;j++){
		        cout << " ";
		    }
		     //Star -> 2n - (2i+1)
		    for(int j=0;j<10-(2*i+1);j++){
		        cout << "*";
		    }
		     //Space
		    for(int j=0;j<i;j++){
		        cout << " ";
		    }
		    cout << endl;
	}
	return 0;
}
